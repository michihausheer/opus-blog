/**
 * Module containing the sale entity.
 */
module opus.sale {
	exports com.opus.webshop.sale;
	
	requires transitive opus.product;
	requires opus.inventory;
	requires opus.basket;
}