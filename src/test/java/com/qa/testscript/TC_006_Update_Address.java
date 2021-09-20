package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_006_Update_Address extends TestBase {

	
	
	@Test
	public void add_new_address() throws InterruptedException
	{
		address_Pages.getMyaddrs().click();
		WebElement add_new_addrs = address_Pages.getAdd_new_addrs();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",add_new_addrs);
		add_new_addrs.click();
        js.executeScript("window.scrollBy(0,550)", "");
        WebElement fname = address_Pages.getFname();
        fname.clear();
        fname.sendKeys("naveen");
        WebElement lastname = address_Pages.getLastname();
        lastname.clear();
        lastname.sendKeys("thi");
        address_Pages.getAddrss1().sendKeys("abcd");
        address_Pages.getCity().sendKeys("kadapa");
        Select sc=new Select(address_Pages.getState());
        sc.selectByVisibleText("Alaska");
        address_Pages.getPostalcode().sendKeys("00001");
        address_Pages.getHome_phone().sendKeys("123456789");
        address_Pages.getMobile_no().sendKeys("987654321");
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement addres_box = address_Pages.getAddres_box();
        addres_box.clear();
        addres_box.sendKeys("padmavathi");
        WebElement save = address_Pages.getSave();
		js.executeScript("arguments[0].scrollIntoView();",save);
		save.click();
		Thread.sleep(2000);
		//WebElement back_to = address_Pages.getBack_to();
		//js.executeScript("arguments[0].scrollIntoView();",back_to);
		//back_to.click();
        
	}
	
	@Test(dependsOnMethods ="add_new_address")
	public void update_Address() throws InterruptedException
	{	
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        address_Pages.getUpdate().click();
        WebElement fname = address_Pages.getFname();
        fname.clear();
        fname.sendKeys("devireddy");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,850)", "");
        address_Pages.getSave().click();
        Thread.sleep(2000);
       // address_Pages.getBack_addrss().click();
        //Thread.sleep(3000);
        
	}
	
	@Test(dependsOnMethods ="update_Address")
	public void delete_address() throws InterruptedException
	{
		Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		address_Pages.getDelete_addrs().click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}
	
	
	
}
