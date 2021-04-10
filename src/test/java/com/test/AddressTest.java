package com.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.Address;

public class AddressTest extends BaseClass{
Address add;

public AddressTest() {
	super();
}
	@BeforeMethod
	public void setUp() {
		initialization();
		add = new Address();
	}
	
	@Test
	public void typevalidname() {
		add.typefirstname("");
	
	
	
		
	
	
	
	
	
	}
	
	//@AfterMethod
	//public void tearDown() {
		//driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
