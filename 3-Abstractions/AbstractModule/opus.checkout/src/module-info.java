import com.opus.webshop.paymentmethod.PaymentMethod;

/**
 * Module providing checkout functionality.
 */
module opus.checkout {
	exports com.opus.webshop.checkout;
	exports com.opus.webshop.paymentmethod;
	
	uses PaymentMethod;
}