package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;
public class AddtoCartPage extends BaseClass{

	
	
	
	@FindBy(xpath ="//button[@class=\"css-ktyipj edzik9p0\"]")
	WebElement crosssigntab;
	@FindBy(xpath ="//button(text()=\"Add to cart\")")
	WebElement Addtocartbtn;
	
	
	
	
	public AddtoCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutPage Clickaddtocrtbtn() throws InterruptedException {
		//crosssigntab.click();
		TestUtil.jsBtnClick(crosssigntab);
		//Addtocartbtn.click();
			TestUtil.jsBtnClick(Addtocartbtn);
		
		return new CheckoutPage();
	
	
	
	
	
	
}

	public CheckoutPage Addtocartbtn() {
		// TODO Auto-generated method stub
		return new CheckoutPage();
	}}
