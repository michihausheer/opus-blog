package com.opus.webshop.inventory;

import java.util.Set;

import com.opus.webshop.basket.Basket;
import com.opus.webshop.basket.BasketRepository;
import com.opus.webshop.product.Product;

/**
 * The inventory stores {@link Product}s.
 */
public class Inventory {

	private BasketRepository basketRepo;
	
	/**
	 * Returns how many items of the given product are available.
	 * 
	 * @param product
	 * @return Count of available items
	 */
	public int getAvailableCount(Product product) {
		int stockCount = 3; 
		int countInBaskets = countInBaskets(product);
		return Math.min(0, stockCount - countInBaskets);
	}

	private int countInBaskets(Product product)
	{
		Set<Basket> baskets = basketRepo.findAllWithProduct(product);
		//For this sample we ignore ordering multiple items of the same product
		return baskets.size();
	}
	
}