package com.qa.testscript;

import org.testng.annotations.Test;


import com.qa.pages.Registeration_page;

public class Registration_test extends TestBase{
	
		@Test
			public void Account() throws InterruptedException
			{
				
			Registeration_page sp=new Registeration_page(driver);
			sp.getSignIn().click();
			sp.getCreateAccount().sendKeys("bhg45444@gmail.com");
			Thread.sleep(2000);
		    sp.getCreateBtn().click();
		    Thread.sleep(20000);
		    sp.getGender().click();
			sp.getFirstname().sendKeys("smith");
		    sp.getLname().sendKeys("kim");
			sp.getPassword().sendKeys("1@06ud");
	   	    sp.getFirst().sendKeys("Smithd");
			sp.getLast().sendKeys("Kimd");
			sp.getCompany().sendKeys("google");
			sp.getAddress1().sendKeys("UK");
			sp.getAddress2().sendKeys("Texas");
			sp.getCity().sendKeys("U.K");
			sp.getState().selectByVisibleText("Florida");
			sp.getPostcode().sendKeys("32118");
			sp.getCountry().selectByVisibleText("United States");
			sp.getOther().sendKeys("hii helllo");
			sp.getPhone().sendKeys("123456");
			sp.getPhone_mobile().sendKeys("54321");
			sp.getAlias().sendKeys("asdfg");
			sp.getRegister1().click(); 
			
			
			
			
		}
			
}
