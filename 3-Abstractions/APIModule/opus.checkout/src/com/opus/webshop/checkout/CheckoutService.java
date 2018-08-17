package com.opus.webshop.checkout;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import com.opus.webshop.paymentmethod.PaymentMethod;

/**
 * Service providing checkout functionality.
 *
 */
public class CheckoutService {

	/**
	 * Retrive a list with possible {@link PaymentMethod}s.
	 * 
	 * @return list of {@link PaymentMethod}
	 */
	public List<PaymentMethod> getPaymentMethods() {
		ServiceLoader<PaymentMethod> loader = ServiceLoader.load(PaymentMethod.class);
		List<PaymentMethod> paymentMethods = new ArrayList<>();
		loader.iterator().forEachRemaining(paymentMethods::add);
		return paymentMethods;
	}

}
