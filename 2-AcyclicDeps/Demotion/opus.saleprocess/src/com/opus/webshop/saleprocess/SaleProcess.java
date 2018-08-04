package com.opus.webshop.saleprocess;

import java.util.Set;

import com.opus.webshop.sale.basket.Basket;
import com.opus.webshop.sale.basket.BasketRepository;
import com.opus.webshop.inventory.Inventory;
import com.opus.webshop.product.Product;
import com.opus.webshop.sale.Sale;

/**
 * Domain controller handling the sales process.
 */
public class SaleProcess {

	private Inventory inventory;
	private BasketRepository basketRepo;

	/**
	 * Shows the given product to the user.
	 *
	 * @param product
	 */
	public void showProduct(Product product) {
		int stockCount = inventory.getStockCount(product);
		int countInBaskets = countInBaskets(product);
		int available = Math.min(0, stockCount - countInBaskets);
		Sale sale = new Sale(available);
		showSale(sale);
	}

	private void showSale(Sale sale) {
	}

	private int countInBaskets(Product product) {
		Set<Basket> baskets = basketRepo.findAllWithProduct(product);
		// For this sample we ignore ordering multiple items of the same product
		return baskets.size();
	}
}
