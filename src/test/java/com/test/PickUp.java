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
import com.page.PickUpTest;
import com.page.ShoppingCart;
import com.page.SignIn;
import com.util.TestUtil;

public class PickUp extends BaseClass {

	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	AddtoCartPage addtocartpage;
	CheckoutPage checkoutpage;
	PickUpTest pickup;
	ContinuetocheckoutPage continuepage;
	ShoppingCart shoppingcart;
	GroceryorderPage groceryorder;
	public   PickUp () {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		pickup = new PickUpTest();
		shoppingcart =new ShoppingCart();
		groceryorder = new GroceryorderPage();
		checkoutpage = new CheckoutPage();
		addtocartpage =new AddtoCartPage();
		fruitspage =new FruitsPageClass();
		testutil = new TestUtil();
		myaccountclass1 = new MyAccountClass();
		continuepage =new ContinuetocheckoutPage();
		signinPage = new SignIn();
		myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
		fruitspage =myaccountclass1.typefruitsname("Fruits");
		addtocartpage =fruitspage.ClickbananaTest();
		checkoutpage =addtocartpage.Addtocartbtn();
		shoppingcart =checkoutpage.Clickcheckoutoption();
		pickup =groceryorder.Clickmethod();
		
	}
	
	
	@Test(priority=1)
	
	public void typemobnumTest() {
		pickup.typenumber("1234567890");
	}
	
	@Test(priority=2)
	public void ClickfreetabbtnTest() {
		pickup.Clickfreetabbtn();
	}
	
	@Test(priority=3)
	public void  ClickproceedtochecktabTest() {
		pickup.Clickproceedtochecktab();
	}
	
	
	
	

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
