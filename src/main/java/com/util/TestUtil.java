package com.util;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baselayer.BaseClass;

public class TestUtil extends BaseClass{
	
	
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPICIT_WAIT = 50;
	
	
	
	public static void jsBtnClick(WebElement element) throws InterruptedException {
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
	}
	
	public static void ExplicitWait(WebElement element) {
		 WebDriverWait wait =new WebDriverWait(driver,30);
		WebElement Productbaby =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"og-autosave-product-categories\\\"]/div[1]/a/div")));
		
	}
	public static void explicitWait(WebElement element) {
		 WebDriverWait wait =new WebDriverWait(driver,30);
		 WebElement subscriptiontab =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"order-history-page\\\"]/div[1]/div/div[2]/div[1]/section/div/div[1]/ul/li[4]")));}
}
