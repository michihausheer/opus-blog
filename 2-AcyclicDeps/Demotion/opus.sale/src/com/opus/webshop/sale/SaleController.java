package com.opus.webshop.sale;

import com.opus.webshop.inventory.Inventory;
import com.opus.webshop.product.Product;

/**
 * Domain controller of a ongoing sale.
 */
public class SaleController {
	
	private Inventory inventory;

	/**
	 * Shows the given product to the user.
	 * 
	 * @param product
	 */
	public void showProduct(Product product)
	{
		int availableCount = inventory.getAvailableCount(product);
		Sale sale = new Sale(availableCount);
		showSale(sale);
	}

	private void showSale(Sale sale) {
	}
}
