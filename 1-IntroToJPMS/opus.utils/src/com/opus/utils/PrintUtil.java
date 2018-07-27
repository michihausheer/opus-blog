package com.opus.utils;

import java.util.Objects;

/**
 * Prints objects to various destinations.
 * 
 * @author Michi Hausheer
 *
 */
public class PrintUtil {

	/**
	 * Print the given object to system out.
	 * 
	 * @param toPrint
	 */
	public static void print(Object toPrint) {
		if(Objects.nonNull(toPrint))
		{
			System.out.println(toPrint.toString());
		}
	}
}
