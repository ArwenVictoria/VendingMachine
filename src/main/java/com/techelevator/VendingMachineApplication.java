package com.techelevator;

import java.math.BigDecimal;

public class VendingMachineApplication {
	


	public static void main(String[] args) {
		
		//Turn on
		
		//Restock method - stocks all items at quantity 5
		
		//***DISPLAY*** Main Menu
		
		//Take customer input
		
			//display next screen based on customer input
			//prompt customer based on input/display
		
		
					//(1) ***DISPLAY*** Vending Machine Items - include positionKey, item name, price, quantity
						//sysout item display
						//return to main menu option
		
					//(2)***DISPLAY*** Purchase -guide through purchase process
						// Display includes: (1)Feed Money, (2) Select Product, (3) Finish Transaction
								//(1) Feed Money
										//takeMoney (CashRegister method - returns customerBalance
											//each $ insert prints line in log.txt file
										//returns to Purchase Menu - displays Balance to user
								//(2) Select Product
										//takes input from customer
											//matches "key" on map to product, gets price
												//if key does not exist, 
													//inform customer, return to purchase menu
											
												//if key does exist, BUT sold out
													//inform customer, return to purchase menu
		
												//if key does exist and is stocked
													//subtract price from remaining balance
													//dispense product
														//print product name, price, remaining balance, yumyumMessage
														//add item and remaining balance to log.txt
													
													//return customer to Purchase Menu
								//(3) Finish Transaction
										//add GIVE CHANGE w/ amount of change to log.txt
										//calculate change in dollars
										//calculate change in coins
										//print message saying change
										//update currentBalance to 0
										//return to Main Menu
					//3 Exit
						//ends program
		
		
		//log.txt:
		// DATE			TIME	$/item-positionKey
		//1/01/2016 12:00:00 PM 	FEED MONEY: 		$5.00 $5.00 
		//01/01/2016 12:00:15 PM 	FEED MONEY: 		$5.00 $10.00 
		//01/01/2016 12:00:20 PM 	Crunchie B4 		$10.00 $8.50 
		//01/01/2016 12:01:25 PM 	Cowtales B2 		$8.50 $7.50 
		//01/01/2016 12:01:35 PM 	GIVE CHANGE: 		$7.50 $0.00
		

	
	}
}