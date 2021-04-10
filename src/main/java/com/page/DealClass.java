package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class DealClass extends BaseClass{
	
	@FindBy (xpath ="//*[@id=\"kPBzieet\"]/div/img")
	WebElement homedealtab;
	
	@FindBy(linkText ="Deals and sales")
	WebElement Dealpagetitle;
	
	
public DealClass () {
	
	
	PageFactory.initElements(driver, this);
}


public void Clicktitleofdealpage() {
	 Dealpagetitle.click();
}



public Dealforhome Clickhomedealopt() {
	 homedealtab.click();
	 return new Dealforhome();
}



}
