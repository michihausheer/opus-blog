package com.opus.webshop.sale;

/**
 * Sale entity.
 */
public class Sale {

	private int availableCount;

	public Sale(int availableCount) {
		this.availableCount = availableCount;
	}
	
	public int getAvailableCount() {
		return availableCount;
	}
}
