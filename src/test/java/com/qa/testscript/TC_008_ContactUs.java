package com.qa.testscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_008_ContactUs extends TestBase {

	@Test
	public void supportTest() {
		
		sp1.getContactUs().click();
		Select sc=new Select(sp1.getSubject());
		sc.selectByVisibleText("Webmaster");
		WebElement email1 = sp1.getEmail1();
		email1.clear();
		email1.sendKeys("sai10091997@gmail.com");
		Select sc1=new Select(sp1.getOrderPrefer());
		sc1.selectByIndex(0);
		Select sc2=new Select(sp1.getProduct());
		sc2.selectByIndex(0);
		sp1.getMessage().sendKeys("wrong order");
		sp1.getSend().click();

	}
}
