package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class DisplayPlay {
	Scanner userInput = new Scanner(System.in);
	CashRegister cashRegister = new CashRegister();
	Inventory allProducts = new Inventory();


	
	public DisplayPlay() {
	}
	
	public void displayMainMenu() throws FileNotFoundException {
		allProducts.setProductList();
		
		System.out.println("***********************************************************");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*            Main Menu                                    *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*            (1) Display Vending Machine Items            *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*            (2) Purchase                                 *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*            (3) Exit                                     *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*            Please select an option to continue          *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("*                                                         *");
		System.out.println("***********************************************************");
		
		
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

			
			System.out.println("***********************************************************");
			System.out.println("*                                   Quantity    		  *");
			System.out.println("*	Item				Price	    Remaining 	Code 	  *");
			System.out.println("*                                                         *");
			System.out.println("*	Potato Crisps     	3.05			5		 A1       *");
			System.out.println("*   Stackers			1.45			5        A2       *");
			System.out.println("*   Grain Waves			2.75			5        A3       *");
			System.out.println("*   Cloud Popcorn		3.65			5        A4       *");
			System.out.println("*   Moonpie   			1.80            5        B1       *");
			System.out.println("*   Cowtales            1.50            5        B2       *");
			System.out.println("*   Wonka Bar           1.50            5        B3       *");
			System.out.println("*   Crunchie            1.75            5        B4       *");
			System.out.println("*   Cola                1.25            5        C1       *");
			System.out.println("*   Dr. Salt            1.50            5        C2       *");
			System.out.println("*   Mountain Melter     1.50            5        C3       *");
			System.out.println("*	Heavy               1.50            5        C4       *");
			System.out.println("*   U-Chews             0.85            5        D1       *");
			System.out.println("*   Little League       0.95            5        D2       *");
			System.out.println("*   Chiclets            0.75            5        D3       *");
			System.out.println("*   Triplemint          0.75            5        D4       *");
			System.out.println("*         Please enter 0 to return to Main Menu           *");
			System.out.println("***********************************************************");	
		
			String displayProductsSelection = userInput.nextLine();
			
			if(displayProductsSelection.equals("0")) {
					displayMainMenu();
				} 
					displayProducts();
		}
	
	
	
			private void displayPurchaseMenu() throws FileNotFoundException {

				
				System.out.println("***********************************************************");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*            Purchase Menu                                *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*            (1) Feed Money                               *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*            (2) Select Product                           *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*            (3) Finish Transaction                       *");
				System.out.println("*                                                         *");
				System.out.println("*            Current Money Provided: $" + cashRegister.getCustomerBalance() + "                *");
				System.out.println("*                                                         *");
				System.out.println("*            Please select an option to continue          *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("***********************************************************");		
			

				String purchaseSelection = userInput.nextLine();
				
				if(purchaseSelection.equals("1")) {
						cashRegister.setCustomerBalance(); //goes to money feed and sets balance
//						System.out.println(cashRegister.getCustomerBalance());
						displayPurchaseMenu();
				} else if (purchaseSelection.equals("2")) {
						displayProductsForPurchase();
				} else if (purchaseSelection.equals("3")) {
					cashRegister.getCustomerCurrencyChange();
					System.out.println("Please press 0 to return to Main Menu");
					String returnInput4 = userInput.nextLine();
					if (returnInput4.equals("0")) {
						displayMainMenu(); //returns them to main menu
						} 
						displayMainMenu();
				}
			}
					
					//return change, print out necessary info & message in application
				
				
		private void displayProductsForPurchase() throws FileNotFoundException {
		
									
			System.out.println("***********************************************************");
			System.out.println("*                                   Quantity    		  *");
			System.out.println("*	Product		        Price	    Remaining 	Code 	  *");
			System.out.println("*                                                         *");
			System.out.println("*	Potato Crisps       3.05		"+ allProducts.getProductString("A1").getQuantity() + "		 A1       *");
			System.out.println("*   Stackers			1.45			5        A2       *");
			System.out.println("*   Grain Waves			2.75			5        A3       *");
			System.out.println("*   Cloud Popcorn		3.65			5        A4       *");
			System.out.println("*   Moonpie   			1.80            5        B1       *");
			System.out.println("*   Cowtales            1.50            5        B2       *");
			System.out.println("*   Wonka Bar           1.50            5        B3       *");
			System.out.println("*   Crunchie            1.75            5        B4       *");
			System.out.println("*   Cola                1.25            5        C1       *");
			System.out.println("*   Dr. Salt            1.50            5        C2       *");
			System.out.println("*   Mountain Melter     1.50            5        C3       *");
			System.out.println("*   Heavy               1.50            5        C4       *");
			System.out.println("*   U-Chews             0.85            5        D1       *");
			System.out.println("*   Little League       0.95            5        D2       *");
			System.out.println("*   Chiclets            0.75            5        D3       *");
			System.out.println("*   Triplemint          0.75            5        D4       *");
			System.out.println("*                                                         *");
			System.out.println("*   Please enter code to purchase or 0 for Previous Menu  *");
			System.out.println("***********************************************************");	
				
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
//					BigDecimal previousBalance = new BigDecimal(cashRegister.getCustomerBalance());// keeps balance for 
					cashRegister.customerBalance = cashRegister.getCustomerBalance().subtract(currentProduct.getPrice()); //NOT WORKING!!!!!
					String dispenseMessagePart1 = "Dispensing " + currentProduct.getName() + " - Price: $" + currentProduct.getPrice();
					String dispenseMessagePart2 = "Your remaining balance is $" + cashRegister.customerBalance; 
					currentProduct.decrementQuantity();
					
					System.out.println(dispenseMessagePart1);
					System.out.println(dispenseMessagePart2);
					System.out.println("");
					System.out.println(currentProduct.yumMessage(currentProduct.getType()));
					System.out.println();
					System.out.println("Please press 0 to return to Purchase Menu");
					
					String returnInput3 = userInput.nextLine();
						if (returnInput3.equals("0")) {
								displayPurchaseMenu(); //returns them to purchase menu
								} 
								displayPurchaseMenu();
			
					//placeholder of audit print method
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
	
