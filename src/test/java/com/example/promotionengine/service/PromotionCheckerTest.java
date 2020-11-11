package com.example.promotionengine.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.promotionengine.model.Order;
import com.example.promotionengine.model.Product;
import com.example.promotionengine.model.Promotion;

public class PromotionCheckerTest {

	private static final PromotionChecker checker = new PromotionChecker();

	@Test
	public void getTotalPromotionPriceTest() {

		Order order = new Order();
		Product p = new Product("A");
		p.setId("1");
		p.setPrice(30.2);
		List<Product> products = new ArrayList<>();
		products.add(p);
		order.setOrderId(1);
		order.setProducts(products);

		Promotion promotion = new Promotion();
		promotion.setPromotionId(1);
		promotion.setPromoPrice(300);

		double result = checker.getTotalPromotionPrice(order, promotion);
		assertNotEquals(result,null);
	}
}
