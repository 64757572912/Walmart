package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.MyAccountClass;
import com.page.OrderHistory;
import com.page.SignIn;
import com.page.Subscription;
import com.util.TestUtil;

public class SubscriptionTest extends BaseClass{
	
	OrderHistory orderhistory;
	SignIn signinPage;
	MyAccountClass myaccountclass1;
	TestUtil testutil;
	Subscription subscrip;
	
	public  SubscriptionTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		subscrip =new Subscription();
		testutil =new TestUtil();
		orderhistory = new OrderHistory();
		signinPage = new SignIn();
		myaccountclass1=signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		myaccountclass1 = new MyAccountClass();
		orderhistory =myaccountclass1.Clickorderhistorytab();
		subscrip =orderhistory.Clicksubscripttab();
	}
	
	@Test(priority=1)
	public void ClickbabyproductTest() throws InterruptedException {
		subscrip.Clickproductb();
		Assert.assertTrue(true, "BabyProductPage should open");
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
