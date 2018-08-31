import com.opus.webshop.inventory.AvailabilityAdjuster;

/**
 * This module provides a API for the inventory.
 *
 */
module opus.inventory {
	exports com.opus.webshop.inventory;
	
	requires transitive opus.product;
	
	uses AvailabilityAdjuster;
}