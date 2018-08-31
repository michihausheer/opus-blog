package com.opus.webshop.sale;

import com.opus.webshop.basket.BasketRepository;
import com.opus.webshop.inventory.Inventory;
import com.opus.webshop.product.Product;

/**
 * Domain service for sales.
 * 
 */
public class SaleService {

	private Inventory inventory;
	private BasketRepository basketRepository;

	public Sale createSaleFor(Product product) {
		int availableCount = getAvailableCountFor(product);
		return new Sale(availableCount);
	}

	private int getAvailableCountFor(Product product) {
		int stockCount = inventory.getStockCount(product);
		int countInBaskets = basketRepository.getCountOfItems(product);
		return stockCount - countInBaskets;
	}
}
