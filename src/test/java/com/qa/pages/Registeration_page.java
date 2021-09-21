package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registeration_page {
	WebDriver driver;
	

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}
	@FindBy(xpath="//input[@id='email_create']")
	WebElement createAccount;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	@FindBy(xpath="//*[@id=\"SubmitCreate\"]")
	WebElement createBtn;
	//button[@id='SubmitCreate']
	//*[@id="SubmitCreate"]
	public WebElement getCreateBtn() {
		return createBtn;
	}

	//gender

	 @FindBy(id="id_gender1")
	WebElement gender;

	public WebElement getGender() {
		return gender;
	}

	@FindBy(id="customer_firstname")
//@FindBy(xpath="//input[@id=\"customer_firstname\"]")
	WebElement fname;


	public WebElement getFirstname() {
		return fname;
	}

	@FindBy(id="customer_lastname")
	WebElement lname;

	public WebElement getLname() {
		return lname;
	}


	@FindBy(id="email")
	WebElement email2;

	public WebElement getEmail2() {
		return email2;
	}


	@FindBy(id="passwd")
	WebElement password;
	public WebElement getPassword() {
		return password;
	}
	 @FindBy(id="days")
	WebElement date;

	public Select getDate() {
		Select date1 = new Select(date);
		return date1;

	}
	@FindBy(id="months")
	WebElement month;

	public Select getMonth() {
		Select mnth = new Select(month);
		return mnth;

	}
	@FindBy(id="years")
	WebElement year;

	public Select getYear() {
		Select year1 = new Select(year);
		return year1;
	}
	@FindBy(id="firstname")
	WebElement first;

	public WebElement getFirst() {
		return first;
	}
	@FindBy(id="lastname")
	WebElement last;

	public WebElement getLast() {
		return last;
	}


	@FindBy(id="company")
	WebElement company;

	public WebElement getCompany() {
		return company;
	}

	@FindBy(id="address1")
	WebElement address1;
	public WebElement getAddress1() {
		return address1;
	}


	@FindBy(id="address2")
	WebElement address2;
	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(id="city")
	WebElement city;

	public WebElement getCity() {
		return city;
	}
	@FindBy(id="id_state")
	WebElement state;

	public Select getState() {
		Select state1 = new Select(state);
		return state1;

	}

	@FindBy(id="postcode")
	WebElement postcode;
	public WebElement getPostcode() {
		return postcode;
	}
	@FindBy(id="id_country")
	WebElement country;

	public Select getCountry() {
		Select con = new Select(country);
		return con;

	}
	@FindBy(id="other")
	WebElement other;
	public WebElement getOther() {
		return other;
	}


	@FindBy(id="phone")
	WebElement phone;

	public WebElement getPhone() {
		return phone;
	}

	@FindBy(id="phone_mobile")
	WebElement phone_mobile;

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	@FindBy(id="alias")
	WebElement alias;

	public WebElement getAlias() {
		return alias;
	}

	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement register1;

	public WebElement getRegister1() {
		return register1;
	}

	public Registeration_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		  
	  }
}
