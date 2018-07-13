package com.opus.address;

import com.opus.utils.PrintUtil;

/**
 * Root entity of the address aggregate.
 * 
 * @author Michi Hausheer
 *
 */
public class Address {
	
	private String firstName;
	private String lastName;

	public Address(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		PrintUtil.print(this);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
