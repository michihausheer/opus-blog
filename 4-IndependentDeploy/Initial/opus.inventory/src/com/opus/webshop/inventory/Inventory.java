package com.opus.webshop.inventory;

import com.opus.webshop.basket.BasketRepository;
import com.opus.webshop.product.Product;

/**
 * The inventory stores {@link Product}s.
 */
public class Inventory {

	private BasketRepository basketRepo;
	
	/**
	 * Return count of items currently in stock.
	 * 
	 * @param product
	 * @return stock count
	 */
	public int getStockCount(Product product) {
		return 3 - getProductCountInBaskets(product);
	}
	
	private int getProductCountInBaskets(Product product)
	{
		//Find all baskets with given product...
		return 1;
	}
}