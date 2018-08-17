/**
 * Module providing checkout functionality.
 */
module opus.checkout {
	exports com.opus.webshop.checkout;
	
	requires opus.creditcard;
	requires opus.paypal;
}