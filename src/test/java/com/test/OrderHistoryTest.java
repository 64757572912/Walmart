package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.MyAccountClass;
import com.page.OrderHistory;
import com.page.SignIn;
import com.util.TestUtil;

public class OrderHistoryTest extends BaseClass {

	OrderHistory orderhistory;
	SignIn signinPage;
	MyAccountClass myaccountclass1;
	TestUtil testutil;
	public OrderHistoryTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testutil =new TestUtil();
		orderhistory = new OrderHistory();
		signinPage = new SignIn();
		myaccountclass1=signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		myaccountclass1 = new MyAccountClass();
		orderhistory =myaccountclass1.Clickorderhistorytab();
	}
	
	
	@Test(priority=1)
	public void validpageTitleTest() {
		orderhistory.validtitlepage();
	}
	
	
	@Test
	public void ClickvalidorderhistoryTest() {
		orderhistory.Clickorderviewtab();
	}
	
	@Test
	
	public void ClickcreditcrdtabTest() throws InterruptedException {
		orderhistory.Clickcreditcrdtab();
	}
	 
	@Test(priority=2)
	public void ClicksubscriptabTest() throws InterruptedException  {
		orderhistory.Clicksubscripttab();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
