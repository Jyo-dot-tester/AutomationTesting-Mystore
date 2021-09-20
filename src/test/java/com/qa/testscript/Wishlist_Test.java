package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.pages.OrderProduct_Page;
import com.qa.pages.WhishlistPage;

public class Wishlist_Test extends TestBase{

	@Test(priority=1)
	public void signIn() {
		
		 OrderProduct_Page order=new OrderProduct_Page(driver);
		 order.getSignIn().click();
		 order.getEmail().sendKeys("ymamatha.535@gmail.com");
			order.getPswd().sendKeys("16Ud1@0535");
			order.getSubmit().click();

		 
	}
	@Test(priority=2)
	public void Wishlist() {
		
		 WhishlistPage wish=new WhishlistPage(driver);
		 //Add to wishlist
		 wish.getAccount().click();
		 wish.getWishlist().click();
		 wish.getName().sendKeys("Printed dress");
		 wish.getSave().click();
		 
		 String ConfirmationText=wish.getProduct().getText();
		 
		 if(ConfirmationText.contains("Printed dress")) {
			   System.out.println("Order Completed: Test Case Passed");
			  }
			  else {
			   System.out.println("Order Not Successfull: Test Case Failed");
			  }
		 //deleting product from wishlist
		 wish.getDeleteProduct().click();
		 
}
	
}