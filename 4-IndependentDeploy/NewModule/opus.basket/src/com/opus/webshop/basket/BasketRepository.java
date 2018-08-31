package com.opus.webshop.basket;

import com.opus.webshop.product.Product;

/**
 * Repository for basket entities.
 * 
 */
public interface BasketRepository {

	/**
	 * Returns count of product items in all baskets
	 * 
	 * @param product
	 * @return count of items
	 */
	public int getCountOfItems(Product product);

}
