package com.example.promotionengine.model;

import java.util.Dictionary;

public class Promotion {
	public int promotionId;
	public Dictionary<String, Integer> ProductInfo;
	public double promoPrice;

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public Dictionary<String, Integer> getProductInfo() {
		return ProductInfo;
	}

	public void setProductInfo(Dictionary<String, Integer> productInfo) {
		ProductInfo = productInfo;
	}

	public double getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(double promoPrice) {
		this.promoPrice = promoPrice;
	}
}
