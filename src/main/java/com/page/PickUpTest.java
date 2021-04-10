package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class PickUpTest  extends BaseClass{
	
	
	@FindBy (xpath ="//input[@id=\"mobileNumber\"]")
	WebElement mobnum;
	
	@FindBy (xpath ="//td[@id=\"ts-row-1-col-3\"]")
	WebElement Freebtn;
	
	
	
	@FindBy (xpath ="//button[contains(text(),\"Proceed to checkout\")]")
	WebElement Proccedcheckoutbtn;
	
	
	
	public PickUpTest () {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void typenumber(String numbers) {
		mobnum.sendKeys(numbers);
		
	}
	
	public void Clickfreetabbtn() {
		Freebtn.click();
	}
	
	
	
	
	
	public ContinuetocheckoutPage Clickproceedtochecktab() {
		Proccedcheckoutbtn.click();
		return new ContinuetocheckoutPage ();
	}
	
	
	

}
