package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver driver;


	//Click on Sign in
	@FindBy(linkText="Sign in")
	WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	//Login
	@FindBy(id="email")
	WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id="passwd")
	WebElement pswd;

	public WebElement getPswd() {
		return pswd;
	}

	@FindBy(id="SubmitLogin")
	WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	public login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
