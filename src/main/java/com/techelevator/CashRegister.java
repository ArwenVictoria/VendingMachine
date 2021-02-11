package com.techelevator;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class CashRegister {
	
	private BigDecimal nickel = new BigDecimal(".05"); 
	private BigDecimal dime = new BigDecimal(".10");
	private BigDecimal quarter = new BigDecimal(".25");
	private BigDecimal oneDollar = new BigDecimal("1.00");
	private BigDecimal twoDollar = new BigDecimal("2.00");
	private BigDecimal fiveDollar = new BigDecimal("5.00");
	private BigDecimal tenDollar = new BigDecimal("10.00");
	public BigDecimal customerBalance = new BigDecimal("0.00");
	
	public CashRegister() {

	}

	public BigDecimal getCustomerBalance() {
		return customerBalance;
	}
	
	public void setCustomerBalance() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner moneyFeed = new Scanner(System.in);
		System.out.println("Please enter dollar bills ($1, $2, $5, $10 accepted).");
		System.out.println("(Example: 1 2 5 10)");
		String dollarInput = moneyFeed.nextLine();  
		String[] dollarInputArray = dollarInput.split(" "); 
		AuditLog audit = new AuditLog();
															
		for (int i = 0; i < dollarInputArray.length; i++) {
		
			if (dollarInputArray[i].equals("1")) {
			customerBalance = customerBalance.add(oneDollar);
			audit.writeMoneyAddedToLog("$1.00" + " $" + customerBalance.toString());
			} else if (dollarInputArray[i].equals("2")) {	
			customerBalance = customerBalance.add(twoDollar);
			audit.writeMoneyAddedToLog("$2.00" + " $" + customerBalance.toString());
			} else if (dollarInputArray[i].equals("5")) {   	
			customerBalance = customerBalance.add(fiveDollar);
			audit.writeMoneyAddedToLog("$5.00" + " $" + customerBalance.toString());
			} else if (dollarInputArray[i].equals("10")) {
				customerBalance = customerBalance.add(tenDollar);
				audit.writeMoneyAddedToLog("$10.00" + " $" + customerBalance.toString());
				}	
			} 
	}

	
	public void getCustomerCurrencyChange() { 
		int dollarCount = 0;
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		String thankYou = "Thank you for your business.";
		
		if (customerBalance.compareTo(BigDecimal.valueOf(0)) > 0) {
		BigDecimal dollars = customerBalance.divide(oneDollar);
		dollarCount = dollars.intValue();
		customerBalance = customerBalance.subtract(oneDollar.multiply(BigDecimal.valueOf(dollarCount)));
			if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
				String toDollarChange = " Your change is " + dollarCount + " dollar(s).";
				System.out.println(thankYou + toDollarChange);
			} else if (customerBalance.compareTo(BigDecimal.valueOf(1)) < 0)  {	
				
				BigDecimal quarters = customerBalance.divide(quarter);
				quarterCount = quarters.intValue();
				customerBalance = customerBalance.subtract(quarter.multiply(BigDecimal.valueOf(quarterCount)));
					if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
					String toQuarterChange = " Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s)"; 
					System.out.println(thankYou + toQuarterChange);
					} else {
		
					BigDecimal dimes = customerBalance.divide(dime);
					dimeCount = dimes.intValue();
					customerBalance = customerBalance.subtract(dime.multiply(BigDecimal.valueOf(dimeCount)));
						if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
						String toDimeChange = " Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s), and " + dimeCount + " dime(s)";
						System.out.println(thankYou + toDimeChange);
							} else {
		
								
								BigDecimal nickels = customerBalance.divide(nickel);
								nickelCount = nickels.intValue();
								customerBalance = customerBalance.subtract(nickel.multiply(BigDecimal.valueOf(nickelCount)));
								String toNickelChange = " Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s), " + dimeCount + " dime(s), and " + nickelCount + " nickel(s). ";
								System.out.println(thankYou + toNickelChange);
							}
					}			
		} else {
			System.out.println(thankYou + " There is no change to return.");
		}
	}
	
	}	
}
