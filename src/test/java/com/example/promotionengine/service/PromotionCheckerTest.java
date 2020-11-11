package com.example.promotionengine.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.promotionengine.model.Product;

public class PromotionCheckerTest {

	private static final PromotionChecker checker = new PromotionChecker();

	@Test
	public void getTotalPriceTest() {
		Product p = new Product("A");
		List<Product> products = new ArrayList<>();
		products.add(p);
		int result = checker.getTotalPrice(products);		
		assertEquals(50, result);
	}
	
	@Test
	public void getTotalPriceTest_failure() {
		Product p = new Product("Invalid");
		List<Product> products = new ArrayList<>();
		products.add(p);
		int result = checker.getTotalPrice(products);		
		assertEquals(0, result);
	}
	
	@Test
	public void testActivePromotion_3A() {
		Product p = new Product("A");
		List<Product> products = new ArrayList<>();
		products.add(p);
		products.add(p);
		products.add(p);
		int result = checker.getTotalPrice(products);
		assertEquals(130, result);
	}
	
	@Test
	public void testActivePromotion_2B() {
		Product p = new Product("B");
		List<Product> products = new ArrayList<>();
		products.add(p);
		products.add(p);
		int result = checker.getTotalPrice(products);
		assertEquals(45, result);
	}
	
	@Test
	public void testActivePromotion_CD() {
		Product p1 = new Product("C");
		Product p2 = new Product("D");
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		int result = checker.getTotalPrice(products);
		assertEquals(35, result);
	}
	
}
