package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Display {
	Scanner userInput = new Scanner(System.in);
	CashRegister cashRegister = new CashRegister();
	Inventory allProducts = new Inventory();
	AuditLog audit = new AuditLog();
	
	public Display() {
	}
	
	public void restock() throws FileNotFoundException {
		allProducts.setProductList();
	}
	
	public void displayMainMenu() throws IOException {
	
		
		System.out.println("********************************************************************");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                 Main Menu                                        *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                 (1) Display Vending Machine Items                *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                 (2) Purchase                                     *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                 (3) Exit                                         *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                 Please select an option to continue              *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("*                                                                  *");
		System.out.println("********************************************************************");
		

		String mainMenuSelection = userInput.nextLine();
		if(mainMenuSelection.equals("1")) {
				displayProducts(); 
		} else if (mainMenuSelection.equals("2")) {
				displayPurchaseMenu();
		} else if (mainMenuSelection.equals("3")) {
			System.exit(0); 
		
	    }

	}
		
	public void displayProducts() throws IOException {

		
	System.out.println("********************************************************************");
	System.out.println("*                                                                  *");
	System.out.println("*                                                   Quantity       *");
	System.out.println("*   Code         Product                Price       Remaining      *");			
	System.out.println("*                                                                  *");
	System.out.println("*   A1           Potato Crisps         $3.05        "+ allProducts.getProductString("A1").getQuantity()+"              *");
    System.out.println("*   A2           Stackers              $1.45        "+ allProducts.getProductString("A2").getQuantity()+"              *");
    System.out.println("*   A3           Grain Waves           $2.75        "+ allProducts.getProductString("A3").getQuantity()+"              *");
	System.out.println("*   A4           Cloud Popcorn         $3.65        "+ allProducts.getProductString("A4").getQuantity()+"              *");
	System.out.println("*   B1           Moonpie               $1.80        "+ allProducts.getProductString("B1").getQuantity()+"              *");
	System.out.println("*   B2           Cowtales              $1.50        "+ allProducts.getProductString("B2").getQuantity()+"              *");
	System.out.println("*   B3           Wonka Bar             $1.50        "+ allProducts.getProductString("B3").getQuantity()+"              *");
	System.out.println("*   B4           Crunchie              $1.75        "+ allProducts.getProductString("B4").getQuantity()+"              *");
	System.out.println("*   C1           Cola                  $1.25        "+ allProducts.getProductString("C1").getQuantity()+"              *");
	System.out.println("*   C2           Dr. Salt              $1.50        "+ allProducts.getProductString("C2").getQuantity()+"              *");
	System.out.println("*   C3           Mountain Melter       $1.50        "+ allProducts.getProductString("C3").getQuantity()+"              *");
	System.out.println("*   C4           Heavy                 $1.50        "+ allProducts.getProductString("C4").getQuantity()+"              *");
	System.out.println("*   D1           U-Chews               $0.85        "+ allProducts.getProductString("D1").getQuantity()+"              *");
	System.out.println("*   D2           Little League         $0.95        "+ allProducts.getProductString("D2").getQuantity()+"              *");
	System.out.println("*   D3           Chiclets              $0.75        "+ allProducts.getProductString("D3").getQuantity()+"              *");
	System.out.println("*   D4           Triplemint            $0.75        "+ allProducts.getProductString("D4").getQuantity()+"              *");
	System.out.println("*                                                                  *");
	System.out.println("*           Please press 0 to return to Main Menu                  *");
	System.out.println("*                                                                  *");
	System.out.println("********************************************************************");	
		
		String displayProductsSelection = userInput.nextLine();
	
		if(displayProductsSelection.equals("0")) {
			displayMainMenu();
		} 
			displayProducts();

	}
	
	
			private void displayPurchaseMenu() throws IOException {
				
				
				System.out.println("********************************************************************");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                     Purchase Menu                                *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                     (1) Feed Money                               *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                     (2) Select Product                           *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                     (3) Finish Transaction                       *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                Current Money Provided: $" + cashRegister.getCustomerBalance() + "                     *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                Please select an option to continue               *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("*                                                                  *");
				System.out.println("********************************************************************");		
			

				String purchaseSelection = userInput.nextLine();
				
				if(purchaseSelection.equals("1")) {
						cashRegister.setCustomerBalance(); 	
						displayPurchaseMenu();
				} else if (purchaseSelection.equals("2")) {
						displayProductsForPurchase();
				} else if (purchaseSelection.equals("3")) {
					//print change to audit file
					audit.writeChangeGivenToLog("$" + cashRegister.getCustomerBalance().toString() + " $0.00");
					
					cashRegister.getCustomerCurrencyChange();
					
					System.out.println("Please press 0 to return to Main Menu");
					String returnInput4 = userInput.nextLine();
					if (returnInput4.equals("0")) {
						displayMainMenu(); 
						} 
						displayMainMenu();
				}		
			}
					
								
				
		private void displayProductsForPurchase() throws IOException {
			
									
			System.out.println("********************************************************************");
			System.out.println("*                                                                  *");
			System.out.println("*                                                   Quantity       *");
			System.out.println("*   Code         Product                Price       Remaining      *");			
			System.out.println("*                                                                  *");
			System.out.println("*   A1           Potato Crisps         $3.05        "+ allProducts.getProductString("A1").getQuantity()+"              *");
		    System.out.println("*   A2           Stackers              $1.45        "+ allProducts.getProductString("A2").getQuantity()+"              *");
		    System.out.println("*   A3           Grain Waves           $2.75        "+ allProducts.getProductString("A3").getQuantity()+"              *");
			System.out.println("*   A4           Cloud Popcorn         $3.65        "+ allProducts.getProductString("A4").getQuantity()+"              *");
			System.out.println("*   B1           Moonpie               $1.80        "+ allProducts.getProductString("B1").getQuantity()+"              *");
			System.out.println("*   B2           Cowtales              $1.50        "+ allProducts.getProductString("B2").getQuantity()+"              *");
			System.out.println("*   B3           Wonka Bar             $1.50        "+ allProducts.getProductString("B3").getQuantity()+"              *");
			System.out.println("*   B4           Crunchie              $1.75        "+ allProducts.getProductString("B4").getQuantity()+"              *");
			System.out.println("*   C1           Cola                  $1.25        "+ allProducts.getProductString("C1").getQuantity()+"              *");
			System.out.println("*   C2           Dr. Salt              $1.50        "+ allProducts.getProductString("C2").getQuantity()+"              *");
			System.out.println("*   C3           Mountain Melter       $1.50        "+ allProducts.getProductString("C3").getQuantity()+"              *");
			System.out.println("*   C4           Heavy                 $1.50        "+ allProducts.getProductString("C4").getQuantity()+"              *");
			System.out.println("*   D1           U-Chews               $0.85        "+ allProducts.getProductString("D1").getQuantity()+"              *");
			System.out.println("*   D2           Little League         $0.95        "+ allProducts.getProductString("D2").getQuantity()+"              *");
			System.out.println("*   D3           Chiclets              $0.75        "+ allProducts.getProductString("D3").getQuantity()+"              *");
			System.out.println("*   D4           Triplemint            $0.75        "+ allProducts.getProductString("D4").getQuantity()+"              *");
			System.out.println("*                                                                  *");
			System.out.println("*                 Please enter code to purchase                    *");
			System.out.println("*   ( or press any key to be prompted to return to Purchase Menu ) *");
			System.out.println("********************************************************************");	
			String productSelected = userInput.nextLine();
			if(allProducts.productsByCode.containsKey(productSelected) //checks if product exists & if is sold out
					&& allProducts.productsByCode.get(productSelected).getQuantity().equals("SOLD OUT")) {
				System.out.println("I'm sorry. That product is SOLD OUT. please press 0 to return to Purchase Menu");
				String returnInput = userInput.nextLine();
				if (returnInput.equals("0")) {
					displayPurchaseMenu(); //returns them to purchase menu
					} 
					displayPurchaseMenu(); //returns the to purchase menu whether they hit 0 or not
					
			} 
			else if (allProducts.productsByCode.containsKey(productSelected)) { //product exists and is not sold out
				Product currentProduct = allProducts.productsByCode.get(productSelected); //stores product in easier to access object
								
				if(cashRegister.getCustomerBalance().compareTo(currentProduct.getPrice()) >= 0) { //compare currentBalance to item price
				//DISPENSING PRODUCT BEGINS:
				cashRegister.customerBalance = cashRegister.getCustomerBalance().subtract(currentProduct.getPrice()); 
				String dispenseMessagePart1 = "Dispensing " + currentProduct.getName() + " - Price: $" + currentProduct.getPrice();
				String dispenseMessagePart2 = "Your remaining balance is $" + cashRegister.customerBalance; 
				currentProduct.decrementQuantity();
				
				System.out.println(dispenseMessagePart1);
				System.out.println(dispenseMessagePart2);
				System.out.println("");
				System.out.println(currentProduct.yumMessage(currentProduct.getType()));
				System.out.println();
				System.out.println();
				System.out.println("Please press 0 to return to Purchase Menu");
				
				String returnInput3 = userInput.nextLine();
					if (returnInput3.equals("0")) {
							displayPurchaseMenu(); //returns them to purchase menu
							} 
							displayPurchaseMenu();
				
				String previousBalance = (cashRegister.getCustomerBalance().add(currentProduct.getPrice())).toString();
				String currentBalance = cashRegister.getCustomerBalance().toString(); 
							
				audit.writeProductPurchaseToLog(" " + currentProduct.getName() + " " + currentProduct.getCode() + " " + currentBalance + " " +  previousBalance);
							
				} else { 
					System.out.println("I'm sorry, you do not have enough money for that product. Press 0 to return to Purchase Menu.");
						String returnInput2 = userInput.nextLine();
						if (returnInput2.equals("0")) {
						displayPurchaseMenu();
						} 
						displayPurchaseMenu();
				}
			
			} else {
			System.out.println("I'm sorry, that product does not exist, please press 0 to return to Purchase Menu");
			String returnToPurchaseMenu = userInput.nextLine();
			if (returnToPurchaseMenu.equals("0")) {
				displayPurchaseMenu();
			}
			
			displayPurchaseMenu();
		}	
	}
				
} 
