package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_pages {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	WebElement search;

	public WebElement getsearch() {
		return search;
	}

	//t-shirts menu
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement magnifierBtn;

	public WebElement getmagnifierBtn() {
		return magnifierBtn;
	}
	

	@FindAll(@FindBy(className="product-name"))
	List<WebElement>ItemNames;
	
	public List<WebElement> getItemNamaes()  {
		return ItemNames;
	}

		public Search_pages(WebDriver driver) {
			this.driver=driver;
		 PageFactory.initElements(driver,this);

		
		}




		} 
	