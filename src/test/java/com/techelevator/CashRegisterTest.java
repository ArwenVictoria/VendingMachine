package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CashRegisterTest {

	
	@Test
	public void get_customer_balance_returns_zero_balance_at_beginning() {
		//Arrange
		CashRegister begin = new CashRegister();		
		//Assert
		Assert.assertEquals("0.00", begin.getCustomerBalance().toString());
	}
	
}
