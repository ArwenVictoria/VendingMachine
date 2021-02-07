package com.techelevator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VedingMachineLog {
	
	//stock inventory
	
public void logDeposit(moneyAdded customerBalance) { //from purchase Menu if(selects feed money)


	String s = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss A").format(LocalDateTime.now());
	System.out.println(java.time.LocalDateTime.now());  
	
	
	LocalDateTime now = LocalDateTime.now();
    String date = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
    String time = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
    
    Object interimBalance;      //not sure if this is correct
	String previousBalance = interimBalance.toString();
    String currentBalance = customerBalance.toString();
    
}  
  public void logPurchase(String codeKey, moneyAdded customerBalance)  {
	  
	LocalDateTime now = LocalDateTime.now();
	String date = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
	String time = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
	//String 
	  
  }
    

	
	
	//log deposit when money is fed in
		//put timestamp here
	
	//log balance
		//put timestamp here
	
	//log purchase

	
	//retrieves & prints time, retrieves & prints action, retrieves & prints money in , retrieves and prints money total

//action either, feed money OR product + code
	
	//prints date(01/01/2021), time(12:00:00 PM), Purchase/action, purchaseName, purchasePrice, previousBalance, customerBalance(to return)
	
	//log transaction when finished 
	
	//update balance in the machine

}
}
