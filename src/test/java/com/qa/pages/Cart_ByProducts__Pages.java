package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_ByProducts__Pages {

	WebDriver driver;
	
	@FindBy(xpath ="//a[@title='View my shopping cart']")
	WebElement cart;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proceedto_chekout;

	@FindBy(id="button_order_cart")
	WebElement check_out;
	
	@FindBy(xpath ="//span[@class='cross']")
	WebElement cross;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/a")
	WebElement home_page;
	
	public WebElement getHome_page() {
		return home_page;
	}


	@FindBy(xpath ="//button[@name='processAddress']")
	WebElement proceed_to_checkout;
	
	@FindBy(id="cgv")
	WebElement terms_condition;
	
	@FindBy(xpath ="//*[@id=\"form\"]/p/button")
	WebElement shipping_checkout;
	
	@FindBy(xpath ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payment;
	
	@FindBy(xpath ="//*[@id=\"cart_navigation\"]/button")
	WebElement confirm_order;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/p/a")
	WebElement back_to_order;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[2]/a")
	WebElement home;
	
	@FindBy(xpath ="//i[@class='icon-trash']")
	WebElement delete;
	
	public WebElement getDelete() {
		return delete;
	}


	public WebElement getShipping_checkout() {
		return shipping_checkout;
	}


	public WebElement getHome() {
		return home;
	}


	public WebElement getBack_to_order() {
		return back_to_order;
	}


	public WebElement getConfirm_order() {
		return confirm_order;
	}


	public WebElement getPayment() {
		return payment;
	}


	public WebElement getTerms_condition() {
		return terms_condition;
	}


	public WebElement getProceed_to_checkout() {
		return proceed_to_checkout;
	}


	public WebElement getCheck_out() {
		return check_out;
	}


	public WebElement getCross() {
		return cross;
	}


	public WebElement getCart() {
		return cart;
	}
	
	
    public WebElement getProceedto_chekout() {
		return proceedto_chekout;
	}


	public Cart_ByProducts__Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

}
