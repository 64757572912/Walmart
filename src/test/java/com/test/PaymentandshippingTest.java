package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.AddtoCartPage;
import com.page.CheckoutPage;
import com.page.ContinuetocheckoutPage;
import com.page.FruitsPageClass;
import com.page.GroceryorderPage;
import com.page.MyAccountClass;
import com.page.Paymentandshipping;
import com.page.PickUpTest;
import com.page.ShoppingCart;
import com.page.SignIn;
import com.util.TestUtil;

public class PaymentandshippingTest extends BaseClass{
	
	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
ContinuetocheckoutPage continuepage;
	AddtoCartPage addtocartpage;
	CheckoutPage checkoutpage;
	PickUpTest pickup;
	Paymentandshipping paymentshipping;
	ShoppingCart shoppingcart;
	GroceryorderPage groceryorder;
	public   PaymentandshippingTest () {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		paymentshipping =new Paymentandshipping();
		continuepage =new ContinuetocheckoutPage();
		pickup = new PickUpTest();
		groceryorder = new GroceryorderPage();
		checkoutpage = new CheckoutPage();
		addtocartpage =new AddtoCartPage();
		fruitspage =new FruitsPageClass();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		shoppingcart =new ShoppingCart();

		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		fruitspage =myaccountclass1.typefruitsname("Fruits");
		addtocartpage =fruitspage.ClickbananaTest();
		checkoutpage =addtocartpage.Addtocartbtn();
		shoppingcart =checkoutpage.Clickcheckoutoption();
		pickup =groceryorder.Clickmethod();
		continuepage =pickup.Clickproceedtochecktab();
		paymentshipping =continuepage .Clickcontinuebtn();
		
	}
	
	
	@Test(priority=1)
	public void typesecuritycode() {
		paymentshipping.typesecuritycode("123");
	}
	
	  
	
	@Test(priority=2)
	public void ClickplaceordertabTest() {
		paymentshipping.Clickplaceordertab();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
