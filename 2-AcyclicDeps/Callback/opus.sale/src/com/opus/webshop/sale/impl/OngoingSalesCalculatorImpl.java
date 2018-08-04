package com.opus.webshop.sale.impl;

import java.util.Set;

import com.opus.webshop.inventory.OngoingSalesCalculator;
import com.opus.webshop.product.Product;
import com.opus.webshop.sale.basket.Basket;
import com.opus.webshop.sale.basket.BasketRepository;

/**
 * Calculate ongoing sales based on baskets.
 */
public class OngoingSalesCalculatorImpl implements OngoingSalesCalculator{

	private BasketRepository basketRepo;
	
	@Override
	public int ongoingSalesCountFor(Product product) {
		Set<Basket> baskets = basketRepo.findAllWithProduct(product);
		//For this sample we ignore ordering multiple items of the same product
		return baskets.size();
	}
}
