package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditLog {
	
	private String date;
	private String time;
	public String productPurchased = "" + date + " " + time + " ";
	public String changeReturned = "" + date + " " + time + " CHANGE RETURNED: ";
	
	public AuditLog()  {

	}
		
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	public void writeToLog(String auditLine) throws IOException {
		String s = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a").format(LocalDateTime.now());
				
		File auditFile = new File("log.txt");
		FileWriter auditWriter = new FileWriter(auditFile, true);
		try (PrintWriter auditPrintLine = new PrintWriter(auditWriter)) {
		auditPrintLine.println(s + " " + auditLine);
		} 
	}
	
	public void writeMoneyAddedToLog(String amountFed) throws IOException {
		String moneyAdded = " FEED MONEY: " + amountFed;
		writeToLog(moneyAdded);
	}
	
	public void writeProductPurchaseToLog(String productDispensed) throws IOException {
		String productPurchased = " " + productDispensed;
		writeToLog(productPurchased);
	}
	
	public void writeChangeGivenToLog(String changeAmount) throws IOException{
		String changeGiven = " GIVE CHANGE: " + changeAmount;
		writeToLog(changeGiven);
	}
 
}

