package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testscript.Support_Test;

public class support_pages {
	WebDriver driver;
	//contact us

	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement contactUs;

	public support_pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		  
	}


	public WebElement getContactUs() {
		return contactUs;
	}
	//subject Headline
	@FindBy(id="id_contact")
	WebElement subject;

	public Select getSubject() {
		Select cat1 = new Select(subject);
		return cat1;
	}
	//Email
	@FindBy(id="email")
	WebElement email1;

	public WebElement getEmail1() {
		return email1;
	}
	//order preference
	@FindBy(id="id_order")
	WebElement orderPrefer;

	public WebElement getOrderpref() {
		return orderPrefer;
	}
	//choose file
	@FindBy(xpath="//*[@id=\"uniform-fileUpload\"]/span[2]")
	WebElement chooseFile;


	public WebElement getChooseFile() {
		return chooseFile;
	}


	//message
	@FindBy(id="message")
	WebElement message;

	public WebElement getMessage() {
		return message;
	}
	//submit msz
	@FindBy(xpath="//*[@id=\"submitMessage\"]/span")
	WebElement send;


	public WebElement getSend() {
		return send;
		
		
	
	
	}


	public WebElement getSignOut() {
		// TODO Auto-generated method stub
		return null;
	}


}
