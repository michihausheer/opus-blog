/**
 * This module provides a API for the inventory.
 *
 */
module opus.inventory {
	exports com.opus.webshop.inventory;
	
	requires opus.basket;
	requires transitive opus.product;
}