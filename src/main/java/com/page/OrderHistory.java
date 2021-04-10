package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;

public class OrderHistory extends BaseClass{

	
	
	@FindBy (linkText ="Order History")
	WebElement Orderpagetitle ;
@FindBy (xpath ="//*[@id=\"view-orders-from-label\"]")
WebElement Orderviewtab;

@FindBy (xpath ="//*[@id=\"order-history-page\"]/div[1]/div/div[2]/div[1]/section/div/div[1]/ul/li[9]")
WebElement Creditcardtab;
	
	
@FindBy(xpath ="//*[@id=\"order-history-page\"]/div[1]/div/div[2]/div[1]/section/div/div[1]/ul/li[4]")
	WebElement subscriptiontab;
	public OrderHistory () {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validtitlepage() {
		return driver.getTitle();
	}
	
	
	
	public void Clickorderviewtab() {
		Orderviewtab.click();
	}
	
	
	public CreditCard Clickcreditcrdtab() throws InterruptedException {
		//Creditcardtab.click();
		TestUtil.jsBtnClick(Creditcardtab);
		return new CreditCard();
	}
	
	
	public Subscription Clicksubscripttab() throws InterruptedException {
		TestUtil.ExplicitWait( subscriptiontab);
		return new Subscription();
	}
	
	
	
	
	
	
	
	
}
