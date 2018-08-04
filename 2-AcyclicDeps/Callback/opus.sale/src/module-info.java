import com.opus.webshop.inventory.OngoingSalesCalculator;
import com.opus.webshop.sale.impl.OngoingSalesCalculatorImpl;

/**
 * Module containing the sale entity.
 */
module opus.sale {
	exports com.opus.webshop.sale;
	
	provides OngoingSalesCalculator with OngoingSalesCalculatorImpl;
	
	requires opus.inventory;
}