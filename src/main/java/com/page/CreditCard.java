package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;
import com.util.TestUtil;

public class CreditCard extends BaseClass {

	
	@FindBy(xpath ="//*[@id=\"skip-to-main\"]/div/div/section/div[1]/button")
	WebElement creditcardoptbtn;
	
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
	
	@FindBy (xpath ="//*[@id=\"province\"]")
	WebElement provincetab;
	
	
	@FindBy(xpath ="//*[@id=\"province\"]")
	WebElement Provincename;
	
	@FindBy(xpath ="//*[@id=\"postalCode\"]")
	WebElement Postalcodetab;
	
	
	@FindBy(xpath ="//*[@id=\"addCardForm\"]/section/div[4]/div[7]/div")
	WebElement phnnumtab;
	
	@FindBy(xpath ="//*[@id=\"addCardForm\"]/section/div[5]/div/div[1]/div/label")
	WebElement Primarycardtab;
	
	@FindBy(linkText ="Save card")
	WebElement savebtn;
	
	
	
	public CreditCard () {
		PageFactory.initElements(driver, this);
		
	}
	
	public Creditdetail Clickcreditcardoptbtn() throws InterruptedException {
		//creditcardoptbtn.click();
		 TestUtil.jsBtnClick(creditcardoptbtn);
		 return new Creditdetail();
	}
	
	/*public Address typecreditinfo(String crdtnum ,String securitynum ,String expirynum , String expiryyr, String address1 ,String cty ,String prvnc ,String postalcd , String phnnumber) throws InterruptedException
	{
		 creditcardnum.sendKeys(crdtnum);
		 securitycode.sendKeys(securitynum);
		 Expirymonth.sendKeys(expirynum);
		 Expiryyear.sendKeys(expiryyr);
		
		 Addressline1.sendKeys(address1);
		 Citytab.sendKeys(cty);
		 Provincename.sendKeys(prvnc);
		 Postalcodetab.sendKeys(postalcd);
		 phnnumtab.sendKeys(phnnumber);
		
		// Primarycardtab.isSelected();
		 TestUtil.jsBtnClick(Primarycardtab);
		 savebtn.click();
		 
		 return new Address();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
