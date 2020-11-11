package com.example.promotionengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.promotionengine.model.Product;
import com.example.promotionengine.service.PromotionChecker;

@SpringBootApplication
public class PromotionEngineApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		System.out.println("Enter total number of order:\n");
		int totalOrder = sc.nextInt();
		for (int i = 0; i <= totalOrder; i++) {
			System.out.println("Enter type of product: A, B, C or D :");
			String type = sc.nextLine();
			Product product = new Product(type);
			products.add(product);
		}
		int totalPrice = PromotionChecker.getTotalPrice(products);
		System.out.println("Total price for order: " + totalPrice);
	}
}
