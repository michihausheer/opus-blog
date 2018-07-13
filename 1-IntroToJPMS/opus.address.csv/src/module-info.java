/**
 * Provides a CSV based address repository.
 * 
 * @author Michi Hausheer
 *
 */
module opus.address.csv {
	requires opus.address;

	provides com.opus.address.AddressRepository with com.opus.address.csv.CSVAddressRepository;
}