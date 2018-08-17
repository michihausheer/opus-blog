package com.opus.webshop.inventory;

import java.util.ServiceLoader;

import com.opus.webshop.product.Product;

/**
 * The inventory stores {@link Product}s.
 */
public class Inventory {

	private OngoingSalesCalculator ongoingSalesCalculator;
	
	public Inventory()
	{
		ServiceLoader<OngoingSalesCalculator> locator = ServiceLoader.load(OngoingSalesCalculator.class);
		this.ongoingSalesCalculator =  locator.iterator().next();
	}
	
	/**
	 * Returns how many items of the given product are available.
	 * 
	 * @param product
	 * @return Count of available items
	 */
	public int getAvailableCount(Product product) {
		int stockCount = 3; 
		int ongoingCount = ongoingSalesCalculator.ongoingSalesCountFor(product);
		return Math.min(0, stockCount - ongoingCount);
	}
}