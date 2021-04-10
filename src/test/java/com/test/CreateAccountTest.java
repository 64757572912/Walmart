package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baselayer.BaseClass;
import com.page.CreateNewAccount;
import com.page.SignIn;

public class CreateAccountTest extends BaseClass {
	SignIn signinPage;
	
CreateNewAccount createnewaccount;
	public CreateAccountTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		createnewaccount = new CreateNewAccount();
		signinPage = new SignIn();
		createnewaccount= signinPage.Clickcreatenewaccountbtn();
	}
	
	@Test(priority=1)
	public void typenameTest() {
		createnewaccount.typename("neel");
	}
	@Test(priority=2)
	public void typelnameTest() {
		createnewaccount.typelname("patel");
	}
	@Test(priority=3)
	public void typenphoneTest() {
		createnewaccount.typephone("647-575-0144");
	}
	@Test(priority=4)
	public void typeemailaddTest() {
		createnewaccount.typeemailad("neelshah21@gmail.com");
	}
	
	@Test(priority=5)
	public void typepasswTest() {
		createnewaccount.typepaswd("Neel3@08");
	}
	
	@Test(priority=6)
	public void checktabTest() {
		createnewaccount.Checkcheckbtn();
	}
	@Test(priority=7)
	public void ClickcreatebtnTest() {
		createnewaccount.Clickcreatebtntab();
		
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
