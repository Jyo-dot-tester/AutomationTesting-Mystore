package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whishlist_Page {

	WebDriver driver;
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement account;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
	WebElement wishlist;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="submitWishlist")
	WebElement save;
	
	@FindBy(xpath="//*[@id=\"wishlist_39165\"]/td[1]/a")
	WebElement product;
	//*[@id="wishlist_39171"]/td[1]/a
	@FindBy(xpath="//i[@class='icon-remove']")
	WebElement deleteProduct;
	
	
	public WebElement getProduct() {
		return product;
	}

	public WebElement getAccount() {
		return account;
	}

	

	public WebElement getWishlist() {
		return wishlist;
	}

	
	public WebElement getName() {
		return name;
	}

	
	public WebElement getSave() {
		return save;
	}
	
	public WebElement getDeleteProduct() {
		return deleteProduct;
	}



	public Whishlist_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		  
	  }

	
}
