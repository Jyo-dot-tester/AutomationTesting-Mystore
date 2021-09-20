package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.pages.signinpages;

public class signin extends TestBase{

	@Test
	public void login() {
		signinpages sp=new signinpages(driver);

		   //1.Click on Sign in
			  sp.getSignIn().click();
			  
			  //2.Login
			  sp.getEmail().sendKeys("ymamatha.535@gmail.com");
			  sp.getPswd().sendKeys("16Ud1@0535");
			  sp.getSubmit().click();
			  sp.getSignOut().click();

	}
	
	 

	

}
