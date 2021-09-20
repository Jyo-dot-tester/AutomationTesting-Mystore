package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Pages {
    
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	WebElement item;
	
	@FindBy(xpath ="//a[@class='login']")
	WebElement signin;
	
	@FindBy(xpath ="//button[@name='Submit']")
	WebElement Addtocart_btn;
	
	@FindBy(id ="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submit_btn;
	
	@FindBy(xpath ="//input[@name='qty']")
	WebElement quantity;
	
	@FindBy(xpath ="//a[@title='Close']")
	WebElement zoom_close;
	
	@FindBy(xpath ="//span[@class='span_link no-print']")
	WebElement zoom;
	
	@FindBy(xpath ="//i[@class='icon-plus']")
	WebElement quantity_incre;
	
	@FindBy(xpath ="//i[@class='icon-minus']")
	WebElement quantity_decre;
	
	@FindAll(@FindBy(xpath ="//select[@id='group_1']"))
	WebElement size;
	
	@FindBy(xpath ="//a[@id='color_24']")
	WebElement color;
	
	@FindBy(xpath ="//input[@id='search_query_top']")
	WebElement search_bar;
	
	@FindBy(xpath ="//button[@name='submit_search']")
	WebElement search_icon;
	
	public WebElement getZoom_close() {
		return zoom_close;
	}

	public WebElement getQuantity_incre() {
		return quantity_incre;
	}

	public WebElement getQuantity_decre() {
		return quantity_decre;
	}

	public WebElement getZoom() {
		return zoom;
	}

	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getSearch_bar() {
		return search_bar;
	}

	 public WebElement getColor() {
		return color;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddtocart_btn() {
		return Addtocart_btn;
	}

	public WebElement getItem() {
		return item;
	}
	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}


	public AddToCart_Pages(WebDriver driver) {
		 this.driver = driver;
			PageFactory.initElements(driver, this);
		
		}

	
}
