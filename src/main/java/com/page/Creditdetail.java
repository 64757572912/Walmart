package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class Creditdetail extends BaseClass {
	
	
	@FindBy (linkText ="Credit / Debit card number")
	WebElement creditcardnum;
	
	@FindBy(xpath ="//*[@id=\"securityCode\"]")
	WebElement securitycode;
	
	@FindBy (xpath ="//*[@id=\"expiryMonth\"]")
	WebElement Expirymonth;
	
	@FindBy (xpath ="//*[@id=\"expiryYear\"]")
	WebElement Expiryyear;
	
	
	@FindBy(xpath ="//*[@id=\"address1\"]")
	WebElement Addressline1;
	
	@FindBy(xpath ="//*[@id=\"city\"]")
	WebElement Citytab;
	
	
	
	

	public Creditdetail () {
		PageFactory.initElements(driver, this);
		
	}
	
	public Address Logincreditd(String crdtnum ,String securitynum ,String expirynum , String expiryyr, String address1 ,String cty) throws InterruptedException
	{
		 creditcardnum.sendKeys(crdtnum);
		 securitycode.sendKeys(securitynum);
		 Expirymonth.sendKeys(expirynum);
		 Expiryyear.sendKeys(expiryyr);
		
		 Addressline1.sendKeys(address1);
		 Citytab.sendKeys(cty);
		 return new Address();
			}
			
	
	
	
	
	
	
	
	

}
