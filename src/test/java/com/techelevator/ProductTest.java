package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {


	@Test
	public void product_returns_correct_code() {
		//arrange
		Product productTest = new Product("A1|Potato Crisps|3.05|Chip");
		Assert.assertEquals("A1", productTest.getCode());
	}
	@Test	
	public void product_name_correctly_identified() {
		
		Product productTest = new Product("A1|Potato Crisps|3.05|Chip");
		Assert.assertEquals("Potato Crisps", productTest.getName());
	}
	@Test
	public void product_price_displays_correctly() {
		
		Product productTest = new Product ("A1|Potato Crisps|3.05|Chip");
		Assert.assertEquals("3.05", productTest.getPrice().toString());
	}
	@Test
	public void product_returns_correct_code_if_null() {
		//arrange
		Product productTest = new Product(null);
		Assert.assertEquals(null, productTest.getCode());
	}
	@Test	
	public void product_name_correctly_identified_null() {
		
		Product productTest = new Product(null);
		Assert.assertEquals(null, productTest.getName());
	}
	@Test
	public void product_price_displays_correctly_null() {
		
		Product productTest = new Product (null);
		Assert.assertEquals(null, productTest.getPrice());
	}
	
	public void product_quantity_starts_at_five() {
		Product testProduct = new Product("A1|Potato Crisps|3.05|Chip");
		
		Assert.assertEquals(5, testProduct.getQuantity());
	}

}