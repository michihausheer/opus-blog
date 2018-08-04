package com.opus.webshop.basket;

import java.util.HashSet;
import java.util.Set;

import com.opus.webshop.product.Product;


/**
 * Repository for storing and retrieving baskets.
 */
public class BasketRepository {

	public Set<Basket> findAllWithProduct(Product product) {
		return new HashSet<>();
	}
}
