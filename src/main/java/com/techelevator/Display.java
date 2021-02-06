package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display {
	Scanner userInput = new Scanner(System.in);

	
	public Display() {
	}
	
	public void displayMainMenu() throws FileNotFoundException {
		
		
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
				displayProducts(); //working
		} else if (mainMenuSelection.equals("2")) {
				displayPurchaseMenu();
		} else if (mainMenuSelection.equals("3")) {
			System.exit(0); //working
		
	    }
	}
		
	public void displayProducts() throws FileNotFoundException {
		Inventory allProducts = new Inventory();
		allProducts.setProductList();
		
	System.out.println("********************************************************************");
	System.out.println("*                                                                  *");
	System.out.println("*                                                   Quantity       *");
	System.out.println("*   Code         Product                Price       Remaining      *");			
	System.out.println("*                                                                  *");
	System.out.println("*   A1           Potato Crisps          3.05        "+ allProducts.getProductString("A1").getQuantity()+"              *");
    System.out.println("*   A2           Stackers               1.45        "+ allProducts.getProductString("A2").getQuantity()+"              *");
    System.out.println("*   A3           Grain Waves            2.75        "+ allProducts.getProductString("A3").getQuantity()+"              *");
	System.out.println("*   A4           Cloud Popcorn          3.65        "+ allProducts.getProductString("A4").getQuantity()+"              *");
	System.out.println("*   B1           Moonpie                1.80        "+ allProducts.getProductString("B1").getQuantity()+"              *");
	System.out.println("*   B2           Cowtales               1.50        "+ allProducts.getProductString("B2").getQuantity()+"              *");
	System.out.println("*   B3           Wonka Bar              1.50        "+ allProducts.getProductString("B3").getQuantity()+"              *");
	System.out.println("*   B4           Crunchie               1.75        "+ allProducts.getProductString("B4").getQuantity()+"              *");
	System.out.println("*   C1           Cola                   1.25        "+ allProducts.getProductString("C1").getQuantity()+"              *");
	System.out.println("*   C2           Dr. Salt               1.50        "+ allProducts.getProductString("C2").getQuantity()+"              *");
	System.out.println("*   C3           Mountain Melter        1.50        "+ allProducts.getProductString("C3").getQuantity()+"              *");
	System.out.println("*   C4           Heavy                  1.50        "+ allProducts.getProductString("C4").getQuantity()+"              *");
	System.out.println("*   D1           U-Chews                0.85        "+ allProducts.getProductString("D1").getQuantity()+"              *");
	System.out.println("*   D2           Little League          0.95        "+ allProducts.getProductString("D2").getQuantity()+"              *");
	System.out.println("*   D3           Chiclets               0.75        "+ allProducts.getProductString("D3").getQuantity()+"              *");
	System.out.println("*   A4           Triplemint             0.75        "+ allProducts.getProductString("D4").getQuantity()+"              *");
	System.out.println("*                                                                  *");
	System.out.println("*       Please enter code to purchase or 0 for Previous Menu       *");
	System.out.println("*                                                                  *");
	System.out.println("********************************************************************");	
		
		
			String displayProductsSelection = userInput.nextLine();
			
			if(displayProductsSelection.equals("0")) {
					displayMainMenu();
			} 
				displayProducts();
		}
	
	
	
			private void displayPurchaseMenu() throws FileNotFoundException {
				CashRegister cashRegister = new CashRegister();
				
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
						cashRegister.setCustomerBalance(); //goes to money feed and sets balance
	
				} else if (purchaseSelection.equals("2")) {
						displayProductsForPurchase();
				} else if (purchaseSelection.equals("3")) {
					cashRegister.getCustomerCurrencyChange();
					System.out.println("Please press 0 to return to Main Menu");
				}
			}
					
					//return change, print out necessary info & message in application
				
				
		private void displayProductsForPurchase() throws FileNotFoundException {
			//initialize inventory
			Inventory allProducts = new Inventory();
			allProducts.setProductList();
									
			System.out.println("********************************************************************");
			System.out.println("*                                                                  *");
			System.out.println("*                                                   Quantity       *");
			System.out.println("*   Code         Product                Price       Remaining      *");			
			System.out.println("*                                                                  *");
			System.out.println("*   A1           Potato Crisps          3.05        "+ allProducts.getProductString("A1").getQuantity()+"              *");
		    System.out.println("*   A2           Stackers               1.45        "+ allProducts.getProductString("A2").getQuantity()+"              *");
		    System.out.println("*   A3           Grain Waves            2.75        "+ allProducts.getProductString("A3").getQuantity()+"              *");
			System.out.println("*   A4           Cloud Popcorn          3.65        "+ allProducts.getProductString("A4").getQuantity()+"              *");
			System.out.println("*   B1           Moonpie                1.80        "+ allProducts.getProductString("B1").getQuantity()+"              *");
			System.out.println("*   B2           Cowtales               1.50        "+ allProducts.getProductString("B2").getQuantity()+"              *");
			System.out.println("*   B3           Wonka Bar              1.50        "+ allProducts.getProductString("B3").getQuantity()+"              *");
			System.out.println("*   B4           Crunchie               1.75        "+ allProducts.getProductString("B4").getQuantity()+"              *");
			System.out.println("*   C1           Cola                   1.25        "+ allProducts.getProductString("C1").getQuantity()+"              *");
			System.out.println("*   C2           Dr. Salt               1.50        "+ allProducts.getProductString("C2").getQuantity()+"              *");
			System.out.println("*   C3           Mountain Melter        1.50        "+ allProducts.getProductString("C3").getQuantity()+"              *");
			System.out.println("*   C4           Heavy                  1.50        "+ allProducts.getProductString("C4").getQuantity()+"              *");
			System.out.println("*   D1           U-Chews                0.85        "+ allProducts.getProductString("D1").getQuantity()+"              *");
			System.out.println("*   D2           Little League          0.95        "+ allProducts.getProductString("D2").getQuantity()+"              *");
			System.out.println("*   D3           Chiclets               0.75        "+ allProducts.getProductString("D3").getQuantity()+"              *");
			System.out.println("*   A4           Triplemint             0.75        "+ allProducts.getProductString("D4").getQuantity()+"              *");
			System.out.println("*                                                                  *");
			System.out.println("*       Please enter code to purchase or 0 for Previous Menu       *");
			System.out.println("*                                                                  *");
			System.out.println("********************************************************************");	
			
			
			String productSelected = userInput.nextLine();
			//if(productSelected.equals(0)) {
				//displayPurchaseMenu(); //if they enter anything other than correct code then print prompt to enter correct item number
				//or 0 for previous menu
				// messages under screens
				 //dispense item method goes here
					//will display if sold out
					//purchase will return print message
					//machine updates the balance
					//returns to purchase menu		
		}
		
} 
	

	
	
	
	
	