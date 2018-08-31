/**
 * Module containing the sale entity.
 */
module opus.sale {
	exports com.opus.webshop.sale;
	
	requires opus.inventory;
	requires transitive opus.product;
	requires opus.basket;
}