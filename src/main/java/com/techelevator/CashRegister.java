package com.techelevator;

import java.math.BigDecimal;

public class CashRegister {
	
	private BigDecimal nickel = new BigDecimal(".05"); //make final?
	private BigDecimal dime = new BigDecimal(".10");
	private BigDecimal quarter = new BigDecimal(".25");
	private BigDecimal oneDollar = new BigDecimal("1.00");
	private BigDecimal fiveDollar = new BigDecimal("5.00");
	private BigDecimal tenDollar = new BigDecimal("10.00");
	private BigDecimal twentyDollar = new BigDecimal("20.00");
	private BigDecimal customerBalance;
	private String customerCoinChange;
	
	public CashRegister(BigDecimal customerBalance) {
		this.customerBalance = customerBalance;
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

	public void getCustomerCoinChange() {
		int dollarCount = 0;
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		String thankYou = "Thank you for your business.";
		
		//2 methods? one for bills , one for coins?
		
		if (customerBalance.compareTo(BigDecimal.valueOf(1)) < 0)  {
			
		//COIN CHANGE
		//check for quarters
		BigDecimal quarters = customerBalance.divide(quarter);
		quarterCount = quarters.intValue();
		customerBalance = customerBalance.subtract(quarter.multiply(BigDecimal.valueOf(quarterCount)));
			if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
				String toQuarterChange = "Your change is " + quarterCount + " quarter(s)"; 
				System.out.println(thankYou + toQuarterChange);
			} 
		
			//check for dimes
			BigDecimal dimes = customerBalance.divide(dime);
			dimeCount = dimes.intValue();
			customerBalance = customerBalance.subtract(dime.multiply(BigDecimal.valueOf(dimeCount)));
				if (customerBalance.compareTo(BigDecimal.valueOf(0)) == 0) {
				String toDimeChange = "Your change is " + quarterCount + " quarter(s), and " + dimeCount + " dime(s)";
				System.out.println(thankYou + toDimeChange);
				} else {
		
				//check for nickels
				BigDecimal nickels = customerBalance.divide(nickel);
				nickelCount = nickels.intValue();
				customerBalance = customerBalance.subtract(nickel.multiply(BigDecimal.valueOf(nickelCount)));
				String toNickelChange = "Your change is " + quarterCount + " quarter(s), " + dimeCount + " dime(s), and " + nickelCount + " nickel(s). ";
				System.out.println(thankYou + toNickelChange);
				}
		}		
		System.out.println(thankYou + "You have no chenge.");;
	}


	public String notEnoughMoney(boolean isEnough) {
		
			
		
		return "You do not have enough money for item selected.";
	}
	
	
	
	
	
	
	
	
}
