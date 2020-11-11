package com.example.promotionengine.model;

import java.util.List;

public class Order {
	public int orderId;
	public List<Product> Products;
		
	/*Getter and Setter*/
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Product> getProducts() {
		return Products;
	}
	public void setProducts(List<Product> products) {
		Products = products;
	}	
}
