import com.opus.webshop.paymentmethod.PaymentMethod;
import com.opus.webshop.paypal.PaypalPaymentService;

/**
 * Provides payment service with paypal.
 */
module opus.paypal {
	requires opus.checkout;
	
	provides PaymentMethod with PaypalPaymentService;
}