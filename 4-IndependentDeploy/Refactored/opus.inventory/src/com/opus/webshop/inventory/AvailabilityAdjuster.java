package com.opus.webshop.inventory;

import com.opus.webshop.product.Product;

/**
 * Provides a adjustment to product availability.
 */
public interface AvailabilityAdjuster {

	/**
	 * Return a adjustement value, can be positiv or negativ.
	 * 
	 * @param product Product to get the adjustment for
	 * @return adjustement count
	 */
	public int getAvailabilityAdjustment(Product product);
}
