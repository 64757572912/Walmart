package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.CreditCard;
import com.page.Creditdetail;
import com.page.MyAccountClass;
import com.page.SignIn;
import com.util.TestUtil;

public class CreditdetailTest extends BaseClass {

	Creditdetail creditdetail;
	CreditCard creditcard;
	TestUtil testutil;
	SignIn signinPage;
	MyAccountClass myaccountclass1;
	
	public CreditdetailTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		creditdetail =new Creditdetail();
		creditcard =new CreditCard();
		testutil =new TestUtil();
		signinPage = new SignIn();
		myaccountclass1=signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		myaccountclass1 = new MyAccountClass();
		
		creditcard =	myaccountclass1.Clickcredittab();
		creditdetail =creditcard.Clickcreditcardoptbtn();
	}
	
	
	
	
	
	
	
	
	
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
