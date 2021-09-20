package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus_Pages {
	WebDriver driver;
	// contact us

	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	WebElement contactUs;

	// submit msz
	@FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
	WebElement send;

	// subject Headline
	@FindAll(@FindBy(id ="id_contact"))
	WebElement subject;
	
	// Email
	@FindBy(id = "email")
	WebElement email1;

	
	// order preference
	@FindAll(@FindBy(name="id_order"))
	WebElement orderPrefer;

	@FindAll(@FindBy(name="id_product"))
	WebElement product;
	
		// message
	@FindBy(id = "message")
	WebElement message;

	public Contactus_Pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getOrderPrefer() {
		return orderPrefer;
	}

	public WebElement getProduct() {
		return product;
	}


	
	public WebElement getSubject() {
		return subject;
	}

	public WebElement getEmail1() {
		return email1;
	}

	public WebElement getOrderpref() {
		return orderPrefer;
	}

	
	public WebElement getMessage() {
		return message;
	}

	public WebElement getSend() {
		return send;

	}

	public WebElement getSignOut() {
		// TODO Auto-generated method stub
		return null;
	}

}
