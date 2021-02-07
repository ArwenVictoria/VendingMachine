package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

	public Map<String, Product> productsByCode = new HashMap<>();

	public void setProductList() throws FileNotFoundException {
		File inventoryFile = new File("vendingmachine.csv");
			
		try(Scanner inventoryScanner = new Scanner(inventoryFile)) {
				while(inventoryScanner.hasNextLine()) {
					String line = inventoryScanner.nextLine();
					Product productSelected = new Product(line);
					String productKey = productSelected.getCode();
					productsByCode.put(productKey, productSelected);              
				}
			}
	}	
	
	public Product getProductString(String code) {
		return productsByCode.get(code);
	}
	
}
