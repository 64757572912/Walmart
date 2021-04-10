package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class Paymentandshipping extends BaseClass {
	
	
	
	@FindBy(xpath ="//input[@id=\"number\"]")
	WebElement verifycodetab;
	
	
@FindBy(xpath ="//button[contains(text(),\"confirm\")]")
WebElement confiormbtn;

@FindBy (linkText ="Place order")
WebElement Placeordertab;


public Paymentandshipping() {
	
	PageFactory.initElements(driver, this);
		
}	


public void typesecuritycode(String code) {
	verifycodetab.sendKeys(code);
	 confiormbtn.click();
}




public void Clickplaceordertab() {
	 Placeordertab.click();
}














	
}