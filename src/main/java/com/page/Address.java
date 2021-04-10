package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class Address extends BaseClass{

	
	@FindBy (xpath ="//*[@id=\"skip-to-main\"]/div/div[1]/div/div/div/button")
	WebElement Addaddressbtn;
	
	
	@FindBy (xpath ="//*[@id=\"firstName\"]")
	WebElement FirstName;
	
	
	@FindBy (xpath ="//*[@id=\"lastName\"]")
	WebElement LastName ;
	
	
	@FindBy (xpath ="//*[@id=\"address1\"]")
	WebElement Addressline1 ;
	
	@FindBy (xpath ="//*[@id=\"city\"]")
	WebElement City ;
	
	
	@FindBy (xpath ="//*[@id=\"province\"]")
	WebElement Province;
	
	@FindBy (xpath ="//*[@id=\"postalCode\"]")
	WebElement Postalcode ;
	
	
	@FindBy (xpath ="//*[@id=\"phoneNumber\"]")
	WebElement Phonenumber;
	
	@FindBy (xpath ="//*[@id=\"undefined-addressForm\"]/div[2]/button")
	WebElement Savebtn ;
	
	public Address() {
		PageFactory.initElements(driver, this);
	}
	
	public void typefirstname(String name) {
		FirstName.sendKeys(name);
	}
	
	public void typelastname(String lname) {
		LastName.sendKeys(lname);
		
	}
	
	
	public void typeaddress(String addressline) {
	Addressline1.sendKeys(addressline);
	
	}
	
	public void typecity(String cty) {
		City.sendKeys(cty);
	}
	
	public void typeprovince(String pvnce) {
	
	Province.sendKeys(pvnce);
	}
	
	public void typepostalcode(String pcode) {
	Postalcode.sendKeys(pcode);
}
      public void typephonenum(String phone) {
    	  Phonenumber.sendKeys(phone);
      }
	
	public void clicksavebtn() {
		Savebtn.click();
	}
	
	public void addaddressbtn() {
		Addaddressbtn.click();
	}
	
	
	
	
	
}
	
	
	
	
	