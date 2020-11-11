package com.example.promotionengine.model;

public class Product {
	
	public String id;
	public double price;
	
	/*Getter and Setter*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	
	public Product(String id) {
		switch (id)
        {
            case "A":
                this.price = 50;

                break;
            case "B":
                this.price = 30;

                break;
            case "C":
                this.price = 20;

                break;
            case "D":
                this.price = 15;
                break;
        }
	}
	
}
