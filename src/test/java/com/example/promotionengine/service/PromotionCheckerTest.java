package com.example.promotionengine.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.promotionengine.model.Product;

public class PromotionCheckerTest {

	private static final PromotionChecker checker = new PromotionChecker();

	@Test
	public void getTotalPromotionPriceTest() {

		Product p = new Product("A");
		p.setId("1");
		p.setPrice(30);
		List<Product> products = new ArrayList<>();
		products.add(p);

		int result = checker.getTotalPrice(products);
		assertNotNull(result);
	}
}
