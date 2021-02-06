package com.techelevator;



public class Product {
	
	private String code; //do we need to get code?
	private String name;
	private String price;   //BigDecimal?
	private String type;
	private int quantity = 5;

	
	public Product(String line) {
		if((line != null) && (!line.isEmpty())) {
			String[] productParts = line.split("\\|"); //code, name, price , type
			this.code = productParts[0];
			this.name = productParts[1];
			this.price = productParts[2];
			this.type = productParts[3];
		}	
	}
		
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public String getQuantity() {
		if (quantity == 0) {
			 return "SOLD OUT";
			}
			return String.valueOf(quantity);
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

}