package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.pages.login_page;

public class Login_Test extends TestBase {
	@Test
	public void signUp() {
		login_page sp=new login_page(driver);
sp.getSignIn().click();
sp.getEmail().sendKeys("ymamatha.535@gmail.com");
sp.getPswd().sendKeys("16Ud1@0535");
sp.getSubmit().click();
}
}
