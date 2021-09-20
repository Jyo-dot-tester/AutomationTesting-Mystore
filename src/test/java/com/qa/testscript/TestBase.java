package com.qa.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

<<<<<<< HEAD
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.AddToCart_Pages;
import com.qa.pages.Address_Pages;
import com.qa.pages.Cart_ByProducts__Pages;
import com.qa.pages.Update_Password_Pages;

public class TestBase {
	public WebDriver driver;
	AddToCart_Pages addToCart_Pages;
    Cart_ByProducts__Pages cart_ByProducts__Pages;
    Address_Pages address_Pages;
    Update_Password_Pages update_Password_Pages;
    @BeforeClass
	public void setup(ITestContext context)
	{
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace-latest\\Application_Mystore_Automation\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		addToCart_Pages=new AddToCart_Pages(driver);
		cart_ByProducts__Pages=new Cart_ByProducts__Pages(driver);
		address_Pages=new Address_Pages(driver);
		update_Password_Pages=new Update_Password_Pages(driver);
		context.setAttribute("WebDriver", driver);
		addToCart_Pages.getSignin().click();
		addToCart_Pages.getEmail().sendKeys("sai10091997@gmail.com");
		addToCart_Pages.getPassword().sendKeys("596844");
		addToCart_Pages.getSubmit_btn().click();
		

		
	}
    
   
    @AfterClass
	public void teardown() throws InterruptedException
	{
    	Thread.sleep(3000);
		driver.close();
	}
=======
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
>>>>>>> 62e6ccc8986a05eb54d56110bd514a40faf3a7a2

