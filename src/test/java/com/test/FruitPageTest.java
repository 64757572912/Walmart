package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.FruitsPageClass;
import com.page.MyAccountClass;
import com.page.SignIn;
import com.util.TestUtil;

public class FruitPageTest extends BaseClass{
	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	
	
	public FruitPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		fruitspage =new FruitsPageClass();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		
		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		fruitspage =myaccountclass1.typefruitsname("Fruits");
	}
	
	
	@Test(priority=1)
	public void ClickfruitbananaTest() throws InterruptedException {
		fruitspage.ClickbananaTest();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	


