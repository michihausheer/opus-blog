package com.opus.webshop.inventory;

import com.opus.webshop.product.Product;

/**
 * Service interface for calculating ongoing sales.
 */
public interface OngoingSalesCalculator {

	/**
	 * Returns count of ongoing sales of a given product.
	 *
	 * @param product
	 * @return count of ongoing sales
	 */
	public int ongoingSalesCountFor(Product product);
}
