import com.opus.address.repository.AddressRepositoryImpl;

/**
 * Opus address handling module.
 * 
 * @author Michi Hausheer
 *
 */
module opus.address {
	exports com.opus.address;

	provides com.opus.address.AddressRepository with AddressRepositoryImpl;

	requires transitive opus.utils;
	requires java.xml;
}