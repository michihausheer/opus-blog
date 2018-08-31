package com.opus.webshop.basket.adjuster;

import com.opus.webshop.inventory.AvailabilityAdjuster;
import com.opus.webshop.product.Product;

/**
 * Implementation of the {@link AvailabilityAdjuster} based on baskets.
 */
public class AvailabilityAdjusterImpl implements AvailabilityAdjuster {

	@Override
	public int getAvailabilityAdjustment(Product product) {
		return 1;
	}

}
