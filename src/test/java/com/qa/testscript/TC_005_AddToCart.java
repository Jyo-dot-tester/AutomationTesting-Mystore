package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_005_AddToCart extends TestBase {
	WebElement quantity;
	String title;
	
	@Test
	public void verifyAddToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		cart_ByProducts__Pages.getHome_page().click();
		title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		addToCart_Pages.getSearch_bar().sendKeys("dresses");
		addToCart_Pages.getSearch_icon().click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		addToCart_Pages.getItem().click();
		WebElement addtocart_btn = addToCart_Pages.getAddtocart_btn();
		if(addtocart_btn.isDisplayed() && addtocart_btn.isEnabled())
		{
			Assert.assertTrue(true);
			System.out.println("add to cart is available ");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("add to cart is not available");
		}
	}
	
	@Test(dependsOnMethods ="verifyAddToCart")
	public void SelectQuantity() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,450)", "");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 quantity = addToCart_Pages.getQuantity();
		quantity.clear();
		quantity.sendKeys("5");
		Thread.sleep(3000);
		if(quantity.getAttribute("value").equals("5"))
		{
			Assert.assertTrue(true);
			System.out.println("entered value is 5 ");
			
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("entered value is wrong ");
			
		}
	}
	@Test(dependsOnMethods ="SelectQuantity")
	public void VerifyQuantity() throws InterruptedException
	{
		
		WebElement quantity_decre = addToCart_Pages.getQuantity_decre();
		quantity_decre.click();
		Thread.sleep(2000);
		if (quantity.getAttribute("value").equals("4")) {
			Assert.assertTrue(true);
			System.out.println("now quantity value is 4 ");	
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("now quantity value is not changed ");	
	
		}
		WebElement quantity_incre = addToCart_Pages.getQuantity_incre();
		quantity_incre.click();
		Thread.sleep(2000);
		if (quantity.getAttribute("value").equals("5")) {
			Assert.assertTrue(true);
			System.out.println("now quantity value is 5 ");	
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("now quantity value is not changed ");	
	
		}
	}
	
	@Test(dependsOnMethods ="VerifyQuantity")
	public void SelectSize_color() throws InterruptedException {
		Thread.sleep(2000);
		Select drpCountry = new Select(addToCart_Pages.getSize());
		drpCountry.selectByVisibleText("M");
		Thread.sleep(2000);
		addToCart_Pages.getColor().click();
		Thread.sleep(2000);
		addToCart_Pages.getZoom().click();
		addToCart_Pages.getZoom_close().click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement addtocart_btn = addToCart_Pages.getAddtocart_btn();
		if(addtocart_btn.isDisplayed() && addtocart_btn.isEnabled())
		{
			addtocart_btn.click();

			Assert.assertTrue(true);
			System.out.println(" clicked on add to cart and the item is added in cart");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		cart_ByProducts__Pages.getCross().click();
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("item is not added in cart");
		}
		
	}
	
	@Test(dependsOnMethods ="SelectSize_color")
	public void Verify_Cart() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement cart = cart_ByProducts__Pages.getCart();
		Actions act=new Actions(driver);
		act.moveToElement(cart).build().perform();
		Thread.sleep(3000);
		cart_ByProducts__Pages.getCheck_out().click();
		WebElement proceedto_chekout = cart_ByProducts__Pages.getProceedto_chekout();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",proceedto_chekout);
		proceedto_chekout.click();
		WebElement proceed_to_checkout = cart_ByProducts__Pages.getProceed_to_checkout();
		js.executeScript("arguments[0].scrollIntoView();",proceed_to_checkout);
		proceed_to_checkout.click();
		cart_ByProducts__Pages.getTerms_condition().click();
		cart_ByProducts__Pages.getShipping_checkout().click();
	}

	@Test(dependsOnMethods ="Verify_Cart")
	public void Payment() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement payment = cart_ByProducts__Pages.getPayment();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",payment);
		payment.click();
		WebElement confirm_order = cart_ByProducts__Pages.getConfirm_order();
		js.executeScript("arguments[0].scrollIntoView();",confirm_order);
		confirm_order.click();
	}
	
	@Test(dependsOnMethods ="Payment")
	public void navigate_to_home()
	{
		cart_ByProducts__Pages.getBack_to_order().click();
		WebElement home = cart_ByProducts__Pages.getHome();
			home.click();
		String title1 = driver.getTitle();
		if(title1.equals(title))
		{
			Assert.assertTrue(true);
			System.out.println("succesfully navigate to home");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println(" navigate to homepage is failed");
		
		}
	}
}
