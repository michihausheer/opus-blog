package com.opus.address.repository;

import com.opus.address.Address;
import com.opus.address.AddressRepository;

/**
 * Default implementation of the address repository.
 * 
 * @author Michi Hausheer
 *
 */
public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public Address getByName(String name) {
		return new Address("Test", name);
	}
}
