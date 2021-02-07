package com.techelevator;

import java.io.IOException;

public class VendingMachineApplication {

	public static void main(String[] args) throws IOException {
		
		
		Display main = new Display();
		main.restock();
		main.displayMainMenu();
		
	}	
	
}