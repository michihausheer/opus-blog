package com.opus.webshop.inventory;

import com.opus.webshop.product.Product;

/**
 * The inventory stores {@link Product}s.
 */
public class Inventory {

	private AvailabilityAdjuster availabilityAdjuster;
	
	/**
	 * Return count of items currently in stock.
	 * 
	 * @param product
	 * @return stock count
	 */
	public int getStockCount(Product product) {
		return 3 + availabilityAdjuster.getAvailabilityAdjustment(product);
	}
}