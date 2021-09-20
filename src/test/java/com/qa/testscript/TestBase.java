package com.qa.testscript;
<<<<<<< HEAD
import java.util.concurrent.TimeUnit;
=======
>>>>>>> 3bce4fe18223f46f6adc934af941ecb7b94df505

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

<<<<<<< HEAD
import com.qa.pages.AddToCart_Pages;
import com.qa.pages.Address_Pages;
import com.qa.pages.Cart_ByProducts__Pages;
import com.qa.pages.OrderProduct_Page;
import com.qa.pages.Search_pages;
import com.qa.pages.Update_Password_Pages;
import com.qa.pages.Whishlist_Page;
import com.qa.pages.Signout_Pages;
import com.qa.pages.Contactus_Pages;

public class TestBase {
	public WebDriver driver;
	AddToCart_Pages addToCart_Pages;
    Cart_ByProducts__Pages cart_ByProducts__Pages;
    Address_Pages address_Pages;
    Update_Password_Pages update_Password_Pages;
    Whishlist_Page wish;
	Search_pages sp;
	OrderProduct_Page order;
	Contactus_Pages sp1;
	Signout_Pages signout_Pages;
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
		wish=new Whishlist_Page(driver);
		sp=new Search_pages(driver);
		order=new OrderProduct_Page(driver);
	    sp1 = new Contactus_Pages(driver);
	    signout_Pages=new Signout_Pages(driver);
		context.setAttribute("WebDriver", driver);
		//Signin mystoreapp
		addToCart_Pages.getSignin().click();
		addToCart_Pages.getEmail().sendKeys("sai10091997@gmail.com");
		addToCart_Pages.getPassword().sendKeys("596844");
		addToCart_Pages.getSubmit_btn().click();
		

		
	}
    
   
    @AfterClass
	public void teardown() throws InterruptedException
	{
    	//Signout
    	signout_Pages.getSignOut().click();
    	Thread.sleep(3000);
		driver.close();
		
	}
}
=======
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
>>>>>>> 3bce4fe18223f46f6adc934af941ecb7b94df505

	  
}
