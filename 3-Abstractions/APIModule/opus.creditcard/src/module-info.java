import com.opus.webshop.creditcard.VisaPaymentService;
import com.opus.webshop.paymentmethod.PaymentMethod;

/**
 * This module provides methods to checkout with different credit cards.
 */
module opus.creditcard {
	requires opus.paymentmethod;

	provides PaymentMethod with VisaPaymentService;
}