package com.techelevator;

public class Product {
	
	private String position;
	private String name;
	private String price;   //BigDecimal
	private int quantity;
	private String type;
	
	public Product(String position, String name, String price, int quantity, String type) {
		this.position = position;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		
	}
	public String getPosition() {
		return position;
	}
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getType() {
		return type;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void decrementQuantity() {
		quantity--;
	}


	
	public String setQuantity() {
		if(quantity == 0) {
		return "SOLD OUT";
		} else {
			return ""+quantity+"";
		
	}	
	
   }
}

