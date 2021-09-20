package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.pages.Search_pages;
import com.qa.pages.support_pages;

public class Support_Test extends TestBase {
	
			@Test
			public void supportTest() {
				support_pages sp=new support_pages(driver);
				 sp.getContactUs().click();
		sp.getSubject().selectByVisibleText("Webmaster");
		sp.getEmail1().sendKeys("ymamatha.535@gmail.com");
		sp.getOrderpref().sendKeys("dresses");
		sp.getMessage().sendKeys("wrong order");
		sp.getSend().click();
		
			}
	 }



