package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.AddtoCartPage;
import com.page.CheckoutPage;
import com.page.FruitsPageClass;
import com.page.GroceryorderPage;
import com.page.MyAccountClass;
import com.page.ShoppingCart;
import com.page.SignIn;
import com.util.TestUtil;

public class GroceryorderTest  extends BaseClass {

	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	
	AddtoCartPage addtocartpage;
	CheckoutPage checkoutpage;
	ShoppingCart shoppingcart;
	
	
	GroceryorderPage groceryorder;
	public  GroceryorderTest () {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
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
		
	}
	
	@Test
	public void typenamedetailsTest() {
		groceryorder.Clickmethod();	}
	
	
	
	
	

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
