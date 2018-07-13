package com.opus.address.csv;

import com.opus.address.Address;
import com.opus.address.AddressRepository;

/**
 * CSV based repository for address entities.
 * 
 * @author Michi Hausheer
 *
 */
public class CSVAddressRepository implements AddressRepository {

	@Override
	public Address getByName(String name) {
		return new Address("CSV", name);
	}
}
