package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Inventory {


	public Map<String, Product> productsByCode = new HashMap<>();

	
	
	public Map<String, Product> setProductList() throws FileNotFoundException {
		File inventoryFile = new File("vendingmachine.csv");
			
		try(Scanner inventoryScanner = new Scanner(inventoryFile)) {
				while(inventoryScanner.hasNextLine()) {
					String line = inventoryScanner.nextLine(); //A1|Potato Crisps|3.05|Chip
					Product productSelected = new Product(line);
//					String productParts = line.replaceAll("\\|", " "); //A1, Potato, 3.05 , Chip
					String productKey = productSelected.getCode();
//					String productString = productParts.substring(3);
					productsByCode.put(productKey, productSelected);              
				}
				return productsByCode;
			}
	}	
	
	public Product getProductString(String code) {
		return productsByCode.get(code);
	}
	

	
//	A1|Potato Crisps|3.05|Chip
//	A2|Stackers|1.45|Chip
//	A3|Grain Waves|2.75|Chip
//	A4|Cloud Popcorn|3.65|Chip
//	B1|Moonpie|1.80|Candy
//	B2|Cowtales|1.50|Candy
//	B3|Wonka Bar|1.50|Candy
//	B4|Crunchie|1.75|Candy
//	C1|Cola|1.25|Drink
//	C2|Dr. Salt|1.50|Drink
//	C3|Mountain Melter|1.50|Drink
//	C4|Heavy|1.50|Drink
//	D1|U-Chews|0.85|Gum
//	D2|Little League Chew|0.95|Gum
//	D3|Chiclets|0.75|Gum
//	D4|Triplemint|0.75|Gum
		

}
