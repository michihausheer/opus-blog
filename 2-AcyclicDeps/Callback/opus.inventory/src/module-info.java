import com.opus.webshop.inventory.OngoingSalesCalculator;

/**
 * This module provides a API for the inventory.
 *
 */
module opus.inventory {
	exports com.opus.webshop.inventory;
	
	uses OngoingSalesCalculator;
	
	requires transitive opus.product;
}