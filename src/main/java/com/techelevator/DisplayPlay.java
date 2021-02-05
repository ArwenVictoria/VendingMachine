package com.techelevator;

import java.util.Scanner;

public class DisplayPlay {
	Scanner userInput = new Scanner(System.in);

	
	public DisplayPlay () {
		
	}
	

	public void displayMainMenu() {

			
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
				displayItems();
		}
		System.out.println("no"); //continue if statements
	}
		
	
	
	public void displayItems() {

		
		System.out.println("***********************************************************");
		System.out.println("*                                            Quantity     *");
		System.out.println("*	Item					Price			 Remaining    *");
		System.out.println("*                                                         *");
		System.out.println("*	Potato Crisps     		3.05				5	      *");
		System.out.println("*   Stackers				1.45				5         *");
		System.out.println("*   Grain Waves				2.75				5         *");
		System.out.println("*   Cloud Popcorn			3.65				5         *");
		System.out.println("*   Moonpie   				1.80                5         *");
		System.out.println("*   Cowtales                1.50                5         *");
		System.out.println("*   Wonka Bar               1.50                5         *");
		System.out.println("*   Crunchie                1.75                5         *");
		System.out.println("*   Cola                    1.25                5         *");
		System.out.println("*   Dr. Salt                1.50                5         *");
		System.out.println("*   Mountain Melter         1.50                5         *");
		System.out.println("*	Heavy                   1.50                5         *");
		System.out.println("*   U-Chews                 0.85                5         *");
		System.out.println("*   Little League           0.95                5         *");
		System.out.println("*   Chiclets                0.75                5         *");
		System.out.println("*   Triplemint              0.75                5         *");
		System.out.println("*                                                         *");
		System.out.println("*    Please Hit R to return to Main Menu                  *");
		System.out.println("***********************************************************");	
		
		String returnToMain = userInput.nextLine();
		//if statement to return to main if r is hit
		
		//update this display
		
	}
	
	//continue this for all displays
}
