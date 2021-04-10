package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;

public class CheckoutPage  extends BaseClass {

	
	
	@FindBy(linkText ="Checkout")
	WebElement Checkouttab;
	@FindBy(xpath ="//button[@class=\"css-ktyipj edzik9p0\"]")
	WebElement crosssigntab;
	
	
	public CheckoutPage () {
		PageFactory.initElements(driver, this);
	}
	
	public  ShoppingCart Clickcheckoutoption() throws InterruptedException {
		// crosssigntab.click();
		//Checkouttab.click();
		TestUtil.jsBtnClick(Checkouttab);
		return new  ShoppingCart ();
	}
	
	
	
	
	
	
	
}
