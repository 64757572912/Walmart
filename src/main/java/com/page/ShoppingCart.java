package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class ShoppingCart extends BaseClass{
	
	@FindBy (xpath ="//button[@type=\"submit\"]")
	WebElement proccedtab;
	
	
	
	public ShoppingCart() {
		PageFactory.initElements(driver, this);
	}
	
	public GroceryorderPage Clickproccedtocheckoutbtn() {
		 proccedtab.click();
		 return new GroceryorderPage();
	}
	
	
	
	
	
	
	
	

}
