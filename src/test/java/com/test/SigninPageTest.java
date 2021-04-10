package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.SignIn;

public class SigninPageTest extends BaseClass {
SignIn signinPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signinPage = new SignIn();
	}
	/*@Test
	public boolean validatelogoTest() {
		//Assert.assertEquals(driver.getTitle(), "Walmart logo");
		return false;
	}*/
	
	
	@Test
    public void HomePageClassSigninTest() {
		signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		Assert.assertEquals(driver.getTitle(), "Walmart Canada");
		
	}
		
	
	@Test(priority=1)
	public void ClickcreatenewaccountbtnTest() {
		signinPage.Clickcreatenewaccountbtn();
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
