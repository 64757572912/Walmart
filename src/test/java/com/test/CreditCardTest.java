package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.CreditCard;
import com.page.MyAccountClass;
import com.page.OrderHistory;
import com.page.SignIn;
import com.util.TestUtil;

public class CreditCardTest extends BaseClass{

	CreditCard creditcard;
	TestUtil testutil;
	SignIn signinPage;
	MyAccountClass myaccountclass1;
	public CreditCardTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		creditcard =new CreditCard();
		testutil =new TestUtil();
		signinPage = new SignIn();
		myaccountclass1=signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		myaccountclass1 = new MyAccountClass();
		
		creditcard =	myaccountclass1.Clickcredittab();
	}
	
	
	@Test(priority=1)
	
	public void ClickcreditcardoptTest() throws InterruptedException {
		/*creditcard.typecreditinfo(prop.getProperty("Credit/Debitcardnumber"),prop.getProperty("Securitycode/CVV"),prop.getProperty("Expirymonth"),prop.getProperty("Expiryyear"),prop.getProperty("Addressline1"),prop.getProperty("City"),prop.getProperty("Province"),prop.getProperty("Psotalcode"),prop.getProperty("Phonenumber"));*/
		creditcard.Clickcreditcardoptbtn();
	}
	

	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
