package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display {
	Scanner userInput = new Scanner(System.in);

	
	public Display() {
	}
	
	public void displayMainMenu() throws FileNotFoundException {
		
		
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
				CashRegister cashRegister = new CashRegister();
				
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
				System.out.println("*            Current Money Provided: " + cashRegister.getCustomerBalance() + "               *");
				System.out.println("*                                                         *");
				System.out.println("*            Please select an option to continue          *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("***********************************************************");		
			

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
	

	
	
	
	
	