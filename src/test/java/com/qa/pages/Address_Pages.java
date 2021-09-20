package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Pages {

	WebDriver driver;
	
	@FindBy(xpath ="//a[@class='account']")
	WebElement account;

	@FindBy(xpath ="//a[@title='Addresses']")
	WebElement myaddrs;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[1]")
	WebElement update;
	
	@FindBy(name ="firstname")
	WebElement fname;
	
	@FindBy(name ="submitAddress")
	WebElement save;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/a")
	WebElement back_addrss;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]")
	WebElement delete_addrs;
	
	@FindBy(xpath ="//a[@title='Add an address']")
	WebElement add_new_addrs;
	
	@FindBy(name ="lastname")
	WebElement lastname;
	
	@FindBy(name ="address1")
	WebElement addrss1;
	
	@FindBy(id ="city")
	WebElement city;
	
	@FindAll(@FindBy(id="id_state"))
	WebElement state;
	
	@FindBy(xpath ="//input[@id='alias']")
	WebElement addres_box;
	
	@FindBy(id="postcode")
	WebElement postalcode;
	
	@FindBy(name="phone")
	WebElement home_phone;
	
	@FindBy(name="phone_mobile")
	WebElement mobile_no;
	
	@FindBy(id ="submitAddress")
	WebElement save1;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/a")
	WebElement back_to;
	
	public WebElement getAdd_new_addrs() {
		return add_new_addrs;
	}


	public WebElement getDelete_addrs() {
		return delete_addrs;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddrss1() {
		return addrss1;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getAddres_box() {
		return addres_box;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getPostalcode() {
		return postalcode;
	}


	public WebElement getHome_phone() {
		return home_phone;
	}


	public WebElement getMobile_no() {
		return mobile_no;
	}


	public WebElement getSave1() {
		return save1;
	}


	public WebElement getBack_to() {
		return back_to;
	}


	public WebElement getBack_addrss() {
		return back_addrss;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getUpdate() {
		return update;
	}


	public WebElement getAccount() {
		return account;
	}
	
	
	public WebElement getMyaddrs() {
		return myaddrs;
	}


	public Address_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

			}

}
