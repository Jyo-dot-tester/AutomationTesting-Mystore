package com.qa.testscript;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TC_003_Wishlist extends TestBase{

	@Test
	public void Wishlist() throws InterruptedException {
		
		 
		 //Add to wishlist
		 //wish.getAccount().click();
		 wish.getWishlist().click();
		 wish.getName().sendKeys("Printed dress");
		 wish.getSave().click();
		 
		  wish.getDeleteProduct().click();
		  Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			
		 
}
	
}
