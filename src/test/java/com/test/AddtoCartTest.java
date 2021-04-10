package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.AddtoCartPage;
import com.page.FruitsPageClass;
import com.page.MyAccountClass;
import com.page.SignIn;
import com.util.TestUtil;

public class AddtoCartTest extends BaseClass{
	
	
	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	AddtoCartPage addtocartpage;
	
	
	
	
	
	public AddtoCartTest () {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		addtocartpage =new AddtoCartPage();
		fruitspage =new FruitsPageClass();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		
		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		fruitspage =myaccountclass1.typefruitsname("Fruits");
		addtocartpage =fruitspage.ClickbananaTest();
		
	}

	@Test
	public void ClickpageTest() {
		addtocartpage.Addtocartbtn();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
