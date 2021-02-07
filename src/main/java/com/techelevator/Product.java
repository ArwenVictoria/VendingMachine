package com.techelevator;

import java.math.BigDecimal;

public class Product {
	
	private String code; //do we need to get code?
	private String name;
	private BigDecimal price;   //BigDecimal?
	private String type;
	public int quantity = 5;

	
	public Product(String line) {
		if((line != null) && (!line.isEmpty())) {
			String[] productParts = line.split("\\|"); //code, name, price , type
			this.code = productParts[0];
			this.name = productParts[1];
			this.price = new BigDecimal(productParts[2]);
			this.type = productParts[3];
		}	
	}
		
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public BigDecimal getPrice() {
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

   //if item is selected, then reduce quantity
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	public int decrementQuantity() {
		return quantity--;
	}
	
	public String yumMessage(String type) {
		if (type.equals("Chip")) {
			return " Crunch Crunch, Yum! ";
		} else if (type.equals("Candy")) {
			return " Munch Munch, Yum! ";
		} else if (type.equals("Drink")) {
			return " Glug Glug, Yum! ";
		} else if (type.equals("Gum")) {
			return " Chew Chew, Yum! ";
		}
		return " Yum! ";
	}
//	public Product getProductString(String code) {
//	
//		return productsByCode.get(code);
//	}

//	public void dispenseProduct() {
//		
//	
//		System.out.println("dispense product");
//		
//	}
}


