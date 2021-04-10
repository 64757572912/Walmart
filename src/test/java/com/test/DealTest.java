package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.DealClass;
import com.page.MyAccountClass;
import com.page.SignIn;
import com.util.TestUtil;

public class DealTest  extends BaseClass{
	
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	DealClass dealclass;
	
	
	
	public DealTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dealclass = new DealClass();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		
		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		dealclass =myaccountclass1.ClickonDealLink();
	}
	
	
	@Test(priority=1)
	public void ClickTitleTest() {
		dealclass.Clicktitleofdealpage();
	}
	
	@Test(priority=2)
	public void ClickhomedealTest() {
		dealclass.Clickhomedealopt();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
