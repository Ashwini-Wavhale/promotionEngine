package com.example.promotionengine.service;

import java.util.List;

import com.example.promotionengine.model.Product;

public class PromotionChecker {

	public int getTotalPrice(List<Product> products) {

		int counterofA = 0, counterofB = 0, CounterofC = 0, CounterofD = 0;

		Product A = new Product("A");
		Product B = new Product("B");
		Product C = new Product("C");
		Product D = new Product("D");

		for (Product pr : products) {
			if (pr.id == "A" || pr.id == "A") {
				counterofA = counterofA + 1;
			}
			if (pr.id == "B" || pr.id == "B") {
				counterofB = counterofB + 1;
			}
			if (pr.id == "C" || pr.id == "C") {
				CounterofC = CounterofC + 1;
			}
			if (pr.id == "D" || pr.id == "D") {
				CounterofD = CounterofD + 1;
			}
		}
		int totalPriceofA = (counterofA / 3) * 130 + (counterofA % 3 * (A.getPrice()));
		int totalPriceofB = (counterofB / 2) * 45 + (counterofB % 2 * (B.getPrice()));
		int totalPriceofC = (CounterofC * (C.getPrice()));
		int totalPriceofD = (CounterofD * (D.getPrice()));
		return totalPriceofA + totalPriceofB + totalPriceofC + totalPriceofD;
	}
}
