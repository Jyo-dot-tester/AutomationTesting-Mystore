package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout_Pages {
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
	


@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
WebElement signOut;

//signOut

public WebElement getSignOut() {
	return signOut;
}

public Signout_Pages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	  
  }

	
	
}
