package com.techelevator;

import java.util.Scanner;
import java.io.PrintWriter;


public class Display {

	private static Scanner userInput = new Scanner(System.in);

	
	public Display(screenInput input, screenOutput output) {
		
		
		
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
		
		String mainSelection = userInput.nextLine();
		
		
		if(mainSelection.equals("1")); { 
			
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
			System.out.println("***********************************************************");	
		} else {
		
			if(mainSelection.equals("2")); { 
				
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
				System.out.println("*            Current Money Provided:                      *");
				System.out.println("*                                                         *");
				System.out.println("*            Please select an option to continue          *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("*                                                         *");
				System.out.println("***********************************************************");		
			
			//	if(mainSelection.equals("3")); { return to main menu;
				
				if(purchaseSelection.equals("1")); {
					
					System.out.println("***********************************************************");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                               *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                             *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*            Please select an option to continue          *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("*                                                         *");
					System.out.println("***********************************************************");		
							
		}
	} 
	
}  //user selects then display will return depending on choice
//if input == 1, run method to display vending machine items
//if input ==2, run method to display purchase
//if input ==3, run exit 
//if input not equal to 1, 2 or 3 then return to main menu
//after each line String userMainSelection = userInput.nextLine();
	Scanner fileInput = new Scanner(System.in);
	System.out.println("Please input your selection");
	String filePath = fileInput.nextLine();
	
	
	
	
	