package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.support_pages;

public class TestBase<signin_pages> {

	static WebDriver driver;
	
	support_pages support_pages ;

@BeforeClass
public WebDriver setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana\\Desktop\\selenium software\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	return driver;
	
}
	
	   @AfterClass
	    public void tearDown() {
	    	//close browser
	    	driver.close();
	    }

	  
}
