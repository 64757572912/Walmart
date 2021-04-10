package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class SignIn extends BaseClass{

	
	@FindBy(xpath ="//*[@id=\"username\"]")
	WebElement Emailaddress;
	
	@FindBy (xpath ="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath ="//*[@id=\"login-form\"]/div/div[7]/button")
    WebElement Signinbtn;
	
	@FindBy (xpath ="/html/body/div[1]/div/div[1]/div/a/svg")
	WebElement Walmartlogo;
	@FindBy (xpath ="/html/body/div[1]/div/div[1]/div/form/div/div[8]/a")
	WebElement Createnewaccounttab;
	
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatelogo() {
		return Walmartlogo.isDisplayed();
		
	}
	
	public  MyAccountClass Signin(String emailadd , String pwd) {
		Emailaddress.sendKeys(emailadd);
		Password.sendKeys(pwd);
		Signinbtn.click();
		return new MyAccountClass();
		
	}
	
	public CreateNewAccount Clickcreatenewaccountbtn() {
		Createnewaccounttab.click();
		return new CreateNewAccount();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
