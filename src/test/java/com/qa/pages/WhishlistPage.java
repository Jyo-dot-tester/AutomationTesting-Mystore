package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhishlistPage {

	WebDriver driver;
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement account;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
	WebElement wishlist;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"submitWishlist\"]/span")
	WebElement save;

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
	@FindBy(xpath="//*[@id=\"wishlist_39165\"]/td[1]/a")
	WebElement product;
	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath="//*[@id=\"wishlist_39165\"]/td[6]/a/i")
	WebElement deleteProduct;
	

	public WebElement getDeleteProduct() {
		return deleteProduct;
	}



	public WhishlistPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		  
	  }

	
}
