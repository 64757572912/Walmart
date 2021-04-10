package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class ContinuetocheckoutPage extends BaseClass{
	
	
	
	
	
	@FindBy (linkText ="Continue to checkout")
WebElement Continuetocheckouttab;



public ContinuetocheckoutPage () {
	PageFactory.initElements(driver,this);
}


public Paymentandshipping Clickcontinuebtn() {
	 Continuetocheckouttab.click();
	 return new Paymentandshipping();
}







}





