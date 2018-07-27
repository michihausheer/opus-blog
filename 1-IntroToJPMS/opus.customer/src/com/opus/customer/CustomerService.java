package com.opus.customer;

import java.util.ServiceLoader;

import com.opus.address.Address;
import com.opus.address.AddressRepository;

import com.opus.utils.PrintUtil;

/**
 * Sample application service that uses the {@link ServiceLoader} to load a repository. 
 * 
 * @author Michi Hausheer
 *
 */
public class CustomerService {
	
	/**
	 * Loads a address with the given name and prints it.
	 * 
	 * @param name
	 */
	public void loadAddress(String name)
	{
		Iterable<AddressRepository> repositories =
				  ServiceLoader.load(AddressRepository.class);
		if(repositories.iterator().hasNext())
		{
			AddressRepository addressRepository = repositories.iterator().next();
			Address address = addressRepository.getByName(name);
			PrintUtil.print(address);
		}
	}
}
