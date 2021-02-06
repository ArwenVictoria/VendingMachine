package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class CashRegister {
	
	private BigDecimal nickel = new BigDecimal(".05"); //make final?
	private BigDecimal dime = new BigDecimal(".10");
	private BigDecimal quarter = new BigDecimal(".25");
	private BigDecimal oneDollar = new BigDecimal("1.00");
	private BigDecimal twoDollar = new BigDecimal("2.00");
	private BigDecimal fiveDollar = new BigDecimal("5.00");
	private BigDecimal tenDollar = new BigDecimal("10.00");
	private BigDecimal customerBalance = new BigDecimal("0");
	private String customerCurrencyChange;
	private String customerChangeTotal;
	
	public CashRegister() {

	}
	
	public BigDecimal getNickel() {
		return nickel;
	}

	public BigDecimal getDime() {
		return dime;
	}

	public BigDecimal getQuarter() {
		return quarter;
	}

	public BigDecimal getOneDollar() {
		return oneDollar;
	}

	public BigDecimal getFiveDollar() {
		return fiveDollar;
	}

	public BigDecimal getTenDollar() {
		return tenDollar;
	}

	public BigDecimal getTwentyDollar() {
		return twentyDollar;
	}

	public BigDecimal getCustomerBalance() {
		return customerBalance;
	}
	
	public BigDecimal setCustomerBalance() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter dollar bills");
		System.out.println("(Example: 1 2 5 10" );
		String dollarInput = userInput.nextLine();
		String[] dollarInputArray = dollarInput.split(",");
		
		for (int i = 0; i < dollarInputArray.length; i++) {
		
			if (dollarInput.equals("1")) {
			customerBalance = customerBalance.add(oneDollar);
			} else if (dollarInput.equals("2")) {
			customerBalance = customerBalance.add(twoDollar);
			} else if (dollarInput.equals("5")) {
			customerBalance = customerBalance.add(fiveDollar);
			} else if (dollarInput.equals("10")) {
				customerBalance = customerBalance.add(tenDollar);
				}
		
			} return customerBalance;
	}

	
	public void getCustomerCurrencyChange() { //DONE
		int dollarCount = 0;
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		String thankYou = "Thank you for your business.";
		
		
		//dollar change
		if (customerBalance.compareTo(BigDecimal.valueOf(0)) > 0) {
		BigDecimal dollars = customerBalance.divide(oneDollar);
		dollarCount = dollars.intValue();
		customerBalance = customerBalance.subtract(oneDollar.multiply(BigDecimal.valueOf(dollarCount)));
			if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
				String toDollarChange = "Your change is " + dollarCount + " dollar(s).";
				System.out.println(thankYou + toDollarChange);
			} else if (customerBalance.compareTo(BigDecimal.valueOf(1)) < 0)  {	
				//COIN CHANGE
				//check for quarters
				BigDecimal quarters = customerBalance.divide(quarter);
				quarterCount = quarters.intValue();
				customerBalance = customerBalance.subtract(quarter.multiply(BigDecimal.valueOf(quarterCount)));
					if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
					String toQuarterChange = "Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s)"; 
					System.out.println(thankYou + toQuarterChange);
					} 
		
					//check for dimes
					BigDecimal dimes = customerBalance.divide(dime);
					dimeCount = dimes.intValue();
					customerBalance = customerBalance.subtract(dime.multiply(BigDecimal.valueOf(dimeCount)));
						if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
						String toDimeChange = "Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s), and " + dimeCount + " dime(s)";
						System.out.println(thankYou + toDimeChange);
							} else {
		
								//check for nickels
								BigDecimal nickels = customerBalance.divide(nickel);
								nickelCount = nickels.intValue();
								customerBalance = customerBalance.subtract(nickel.multiply(BigDecimal.valueOf(nickelCount)));
								String toNickelChange = "Your change is " + dollarCount + " dollar(s), " + quarterCount + " quarter(s), " + dimeCount + " dime(s), and " + nickelCount + " nickel(s). ";
								System.out.println(thankYou + toNickelChange);
							}
					}		
		
		} else {
			System.out.println(thankYou + "There is no change to return.");
		}
	}


	public String notEnoughMoney(boolean isEnough) {
		if (customerBalance.compareTo(Product.getPrice()) > 0) {
			
		}
			
		
		return "You do not have enough money for item selected.";
	}
	
	
	public BigDecimal resetBalanceToZero() {
		customerBalance = 0;
		return customerBalance;
		
	}
	
	
	
	
	
}
