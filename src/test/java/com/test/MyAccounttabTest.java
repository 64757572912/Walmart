package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.CreateNewAccount;
import com.page.MyAccountClass;
import com.page.SignIn;
import com.util.TestUtil;


public class MyAccounttabTest extends BaseClass {

	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	
	
	
	
	public MyAccounttabTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		
		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		
	}
	
	
	@Test
	public void ClickorderhistorytabTest() throws InterruptedException  {
		myaccountclass1.Clickorderhistorytab();
	}
	
	@Test
	public void ClickcreditcrdoptTest() throws InterruptedException {
		myaccountclass1.Clickcredittab();
		
		
		
	}
	
	@Test(priority=2)
	public void ClickonDealLinkTest() {
		myaccountclass1.ClickonDealLink();
	}
	
@Test(priority=1)
public void typefruitTest() {
	myaccountclass1.typefruitsname("Fruits");
	
}
		
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
