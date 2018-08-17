import com.opus.webshop.paymentmethod.PaymentMethod;

/**
 * Module providing checkout functionality.
 */
module opus.checkout {
	exports com.opus.webshop.checkout;
	
	requires opus.paymentmethod;
	
	uses PaymentMethod;
}