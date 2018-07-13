package com.opus.customer;

import java.util.ServiceLoader;

import com.opus.address.Address;
import com.opus.address.AddressRepository;

import com.opus.utils.PrintUtil;

public class CustomerService {
	
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
