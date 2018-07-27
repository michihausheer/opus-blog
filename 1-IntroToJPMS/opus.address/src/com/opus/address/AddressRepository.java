package com.opus.address;

/**
 * Repository for {@link Address} entities.
 * 
 * @author Michi Hausheer
 *
 */
public interface AddressRepository {

	/**
	 * Gets a exiting address by name.
	 * 
	 * @param name Name of the owner of the address
	 * @return the {@link Address}
	 */
	Address getByName(String name);
}
