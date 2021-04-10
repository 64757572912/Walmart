package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;


public class MyAccountClass extends BaseClass{

	
	@FindBy (xpath ="//*[@id=\"accounts-home-page\"]")
	WebElement Orderhistorytab;
	
	@FindBy (xpath ="//input[@role=\"search\"]")
	WebElement searchtab;
	@FindBy(xpath ="//button[@type=\"submit\"]")
	WebElement sesrchfruits;
	@FindBy(xpath ="//*[@id=\"accounts-home-page\"]")
	WebElement Addresstab;
	
	@FindBy (linkText ="Credit Cards")
	WebElement Creditcardtab;
	
	@FindBy (xpath ="//*[@id=\"accounts-home-page\"]")
	WebElement Subscriptiontab;
	
	@FindBy(xpath ="//*[@id=\"accounts-home-page\"]")
	WebElement Profilesettingtab;
	
	@FindBy(xpath ="//*[@id=\"cartoutline_a\"]")
	
	WebElement shoppingcartlogo;
	
	
	
	public MyAccountClass() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderHistory Clickorderhistorytab() throws InterruptedException  {
		//Orderhistorytab.click();
		TestUtil.jsBtnClick(Orderhistorytab);
		return new OrderHistory();
	}
	
	public CreditCard Clickcredittab() throws InterruptedException  {
		//Creditcardtab.click();
		TestUtil.jsBtnClick(Creditcardtab);
		return new CreditCard();
	}
	
	public Address Clickaddtab()  {
		 Addresstab.click();
		return new Address();
	}
	public ShoppingCart Clickshoppinglogo()  {
		shoppingcartlogo.click();
		return new ShoppingCart();
	}
	
	public InformationPage Clickprofilesettingtab() {
		Profilesettingtab.click();
		return new InformationPage();
	}
	
	
	
	
	public Autosave Clicksubscribtab() throws InterruptedException  {
		//Subscriptiontab.click();
		TestUtil.jsBtnClick(Subscriptiontab);
		return new Autosave();
	}
	
	
	public FruitsPageClass typefruitsname(String frt) {
		searchtab.sendKeys(frt);
		 sesrchfruits.click();
		
		return new FruitsPageClass();
	}

	public DealClass ClickonDealLink() {
		// TODO Auto-generated method stub
		return new DealClass();
	}
	
	
	
}
