/**
 * Module containing the sale entity.
 */
module opus.sale {
	exports com.opus.webshop.sale;
	exports com.opus.webshop.sale.basket;
	
	requires transitive opus.product;
}