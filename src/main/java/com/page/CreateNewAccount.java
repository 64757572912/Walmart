package com.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;



public class CreateNewAccount extends BaseClass{








	@FindBy (xpath ="//*[@id=\"firstName\"]")
	WebElement FirstName;
	
	@FindBy (xpath ="//*[@id=\"lastName\"]")
	WebElement LastName;
	
	@FindBy (xpath = "//*[@id=\"phoneNumber\"]")
	WebElement Phonenumber;
	
	@FindBy (xpath ="//*[@id=\"email\"]")
	WebElement Emailaddress;
	
	@FindBy (xpath ="//*[@id=\"password\"]")
	WebElement Password;
	@FindBy (xpath ="//*[@id=\"create-account-form\"]/div/div[8]/div/div/label")
	WebElement optionalcheckbox;
	
	@FindBy (xpath ="//*[@id=\"create-account-form\"]/div/div[9]/div/div/label")
	WebElement mendatorycheckbox;
	
	@FindBy (xpath ="//*[@id=\"create-account-form\"]/div/div[10]/button")
	WebElement createaccountbtn;
	
	@FindBy (xpath ="//*[@id=\"create-account-form\"]/div/div[11]/a")
	WebElement signinbtn;
  @FindBy (xpath ="/html/body/div[1]/div/div[1]/div/a/svg/path[1]")
  WebElement WalamrtLogo;
  @FindBy(xpath ="/html/body/div[1]/div/div[1]/div/form/div/div[9]/div/div/label")
  WebElement Checkbox;
    public  CreateNewAccount() {
  	  PageFactory.initElements(driver, this);
  	  
    }
  
 public void Clickwalmartlogo() {
	 WalamrtLogo.isDisplayed();
 }
  
 public void typename(String nm) {
	 FirstName.sendKeys(nm);
 }
 
 public void typelname(String lnm) {
	 LastName.sendKeys(lnm);
 }
 
 
 public void typephone(String phn) {
	 Phonenumber.sendKeys(phn);
 }
 
 public void typeemailad(String emladrs) {
	 Emailaddress.sendKeys(emladrs);
 }
 
 public void typepaswd(String Pass) {
	 Password.sendKeys(Pass);
 }
 
 public MyAccountClass Clickcreatebtntab() {
	 createaccountbtn.click();
	 return new MyAccountClass();
 }
 
 public void Checkcheckbtn() {
	 Checkbox.isSelected();
 }
 
 
 
 
 
 
 
 
  
}
  