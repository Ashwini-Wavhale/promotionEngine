package com.example.promotionengine.model;

public class Product {
	
	public String id;
	public int price;
	
	/*Getter and Setter*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int d) {
		this.price = d;
	}
	
	public Product(String id) {
		switch (id)
        {
            case "A":
            	this.id = "A";
                this.price = 50;

                break;
            case "B":
            	this.id = "B";
                this.price = 30;

                break;
            case "C":
            	this.id = "C";
                this.price = 20;

                break;
            case "D":
            	this.id = "D";
                this.price = 15;
                break;
        }
	}
	
}
