package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_005_Product_remove_cart extends TestBase{

	@Test
	public void delete_item_cart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		addToCart_Pages.getSearch_bar().sendKeys("dresses");
		addToCart_Pages.getSearch_icon().click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		addToCart_Pages.getItem().click();
		 addToCart_Pages.getAddtocart_btn().click();
		 cart_ByProducts__Pages.getCross().click();
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			WebElement cart = cart_ByProducts__Pages.getCart();
			Actions act=new Actions(driver);
			act.moveToElement(cart).build().perform();
			Thread.sleep(3000);
			cart_ByProducts__Pages.getCheck_out().click();
			cart_ByProducts__Pages.getDelete().click();
			
	}
	
	
}
