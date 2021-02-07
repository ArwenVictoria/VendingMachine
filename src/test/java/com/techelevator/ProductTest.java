package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

	//to test:
	//setters for keycode, name, price, quantity (plus decrementing), type
	// if out of stock
	
	//arrange
	//act
	//assert
	@Test
	public void product__returns_correct_code() {
		//arrange
		Product productTest = new Product("A1");
		Assert.assertEquals("A1", productTest.getCode());
	}
	@Test	
	public void product_name_correctly_identified() {
		
		Product productTest = new Product("Potato Crisps");
		Assert.assertEquals("Potato Crisps", productTest.getName());
	}
	@Test
	public void product_price_displays_correctly() {
		
		Product productTest = new Product ("3.05");
		Assert.assertEquals("3.05", productTest.getPrice());
	}
	@Test
	public void product_quantity_sets_correctly() {
		
		Product productTest = new Product ("5");
		Assert.assertEquals("5", productTest.getQuantity());
	}
	@Test
	public void product_decrements_correctly() {
		
		Product productTest = new Product ("4"); 
		Assert.assertEquals("4", productTest.getQuantity());
		
	}

	}
	
	
	
	



//example
/* @Test
public void has_minimum_cigars_for_successful_party_weekend() {
//Arrange
CigarParty cigarTest = new CigarParty();

//boolean isWeekend = true;

//Act
boolean isPartySuccessful = cigarTest.haveParty(120, true);

//Assert
Assert.assertEquals(true, isPartySuccessful); */

//examples
/* 	@Test
	public void getHer_returns_unknown_for_unaccounted_for_animal_name() {
		// arrange
		AnimalGroupName animalsToGroups = new AnimalGroupName();
		
		//act
		String herd = animalsToGroups.getHerd("cat");
		
		//assert
		Assert.assertEquals("unknown", herd); */