package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Password_Pages {

	
	WebDriver driver;
	
	@FindBy(xpath ="//a[@title='Information']")
	WebElement personal_info;
	
	@FindBy(id="old_passwd")
	WebElement old_pswd;
	
	@FindBy(id="passwd")
	WebElement new_pswd;
	
	@FindBy(id="confirmation")
	WebElement confirm_paswd;
	
	@FindBy(name="submitIdentity")
	WebElement save;
	
	public WebElement getSave() {
		return save;
	}

	public WebElement getPersonal_info() {
		return personal_info;
	}

	public WebElement getOld_pswd() {
		return old_pswd;
	}



	public WebElement getNew_pswd() {
		return new_pswd;
	}



	public WebElement getConfirm_paswd() {
		return confirm_paswd;
	}



	public Update_Password_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
