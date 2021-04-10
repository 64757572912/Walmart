package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;

public class FruitsPageClass extends BaseClass{
	
	
	
	@FindBy (xpath =" //p[contains(text(),\"Apple, Gala\")]")
	WebElement appleimg;
	
	public FruitsPageClass () {
	PageFactory.initElements(driver, this);
	}
	
	
	public  AddtoCartPage ClickbananaTest() throws InterruptedException {
		TestUtil.jsBtnClick( appleimg);
		return new AddtoCartPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
