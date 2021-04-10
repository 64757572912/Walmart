package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.CheckoutPage;
import com.page.FruitsPageClass;
import com.page.MyAccountClass;
import com.page.ProcceedtoCheckoutPage;
import com.page.ShoppingCart;
import com.page.SignIn;
import com.util.TestUtil;

public class ShoppingCartTest extends  BaseClass{

	
	FruitsPageClass fruitspage;
	MyAccountClass myaccountclass1;
	SignIn signinPage;
	
TestUtil testutil;
	ShoppingCart shoppingcart;
ProcceedtoCheckoutPage proccedpage;
	
CheckoutPage checkoutpage;
	 public ShoppingCartTest() {
		 super();
		 
	 }
	
	
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			shoppingcart =new ShoppingCart();
			proccedpage =new  ProcceedtoCheckoutPage();
			fruitspage =new FruitsPageClass();
			testutil = new TestUtil();
			myaccountclass1 = new MyAccountClass();
			checkoutpage = new CheckoutPage();
			signinPage = new SignIn();
			myaccountclass1 =signinPage.Signin(prop.getProperty("Emailaddress"),prop.getProperty("Password"));
			fruitspage =myaccountclass1.typefruitsname("Fruits");
			shoppingcart =checkoutpage.Clickcheckoutoption();
			
		}
	
	
	@Test
	public void ClickprocceddtocheckTest() {
		shoppingcart.Clickproccedtocheckoutbtn();
	}
	


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
