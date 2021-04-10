package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;

public class Subscription extends BaseClass{

	@FindBy (linkText ="My Subscriptions")
	WebElement subscriptionpagetitle;
	
	
	@FindBy (xpath ="//*[@id=\"og-autosave-product-categories\"]/div[1]/a/div")
	WebElement Productbaby;
	
	
	
	public Subscription () {
		PageFactory.initElements(driver, this);
	}
	public BabyProductPage Clickproductb()  {
		//Productbaby.click();
		TestUtil.ExplicitWait(Productbaby);
return new BabyProductPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
