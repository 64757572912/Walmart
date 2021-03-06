package com.baselayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.TestUtil;

public class BaseClass {

	
	
	public static WebDriver driver;
	public static Properties prop;
	public static TestUtil testutil;
	public BaseClass () {
		
		try {
			prop =new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\shivu\\eclipse-workspace\\project1\\src\\main\\java\\com\\config\\properties\\configure.properties");
			prop.load(ip);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	} 
		
		public static void initialization() {
			String browserName = prop.getProperty("browser");
			if (browserName.equals("Firefox")) {
				 System.setProperty("webdriver.gecko.driver", "..\\geckodriver.exe");
					driver = new FirefoxDriver();
			 
			}
			 else if (browserName.equals("Chrome")) {
				 System.setProperty("webdriver.chrome.driver","..\\chromedriver.exe");
					 driver =new ChromeDriver();
			 }
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));

			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
