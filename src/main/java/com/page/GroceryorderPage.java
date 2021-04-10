package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class GroceryorderPage  extends BaseClass {
	
	
	@FindBy(xpath ="//input[@id=\"firstName\"]")
	WebElement FirstName;
	
	@FindBy (xpath ="//input[@id=\"lastName\"]")
	WebElement Lastname;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")
	WebElement findtab;
	
	@FindBy(xpath ="//button[contains(text(),\"Use this location\")]")
	
	WebElement linktab;
	
	public GroceryorderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PickUpTest Clickmethod() {
		
		 linktab.click();
		 return new PickUpTest();
	}

	public PickUpTest typenamepage() {
		// TODO Auto-generated method stub
		return new PickUpTest();
	}

	public PickUpTest Clickmethod1() {
		// TODO Auto-generated method stub
		return new PickUpTest();
	}
	

}
