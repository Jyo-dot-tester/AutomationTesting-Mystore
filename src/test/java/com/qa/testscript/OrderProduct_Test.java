package com.qa.testscript;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.qa.pages.OrderProduct_Page;

public class OrderProduct_Test extends TestBase {
	
	
	public OrderProduct_Test() {
		super();
	}
	@Test
	public void buyProduct() {
		
    OrderProduct_Page order=new OrderProduct_Page(driver);
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	  //1.Click on Sign in
	order.getSignIn().click();
	  
	  //2.Login
	order.getEmail().sendKeys("ymamatha.535@gmail.com");
	order.getPswd().sendKeys("16Ud1@0535");
	order.getSubmit().click();

//	  3. Move your cursor over Women's link.
	order.getWomenLink().click();
	  
//	  4. Click on sub menu 'T-shirts'.
	order.getTshirtsLink().click();
	  
//	  5. Mouse hover on the first product displayed.
//	  6. 'More' button will be displayed, click on 'More' button.
	  Actions actions=new Actions(driver);
	  actions.moveToElement(order.getImage()).moveToElement(order.getMoreBtn()).click().perform();
	  
//	  7. Increase quantity to 2.
	  order.getQuantity().clear();
	  order.getQuantity().sendKeys("2");
	 
//	  8. Select size 'M'
	  order.getSize().selectByVisibleText("M");
	 
//	  9. Select color.
	  order.getColor().click();
	 
//	  10. Click 'Add to Cart' button.
	  order.getAddTocart().click();
	 
//	  11. Click 'Proceed 
	  order.getProceed().click();
	 
//   12. click proceed to checkout
	  order.getPageProceed().click();
	  order.getPagecheckout().click();
	 
//	  13. Complete the buy order process till payment.
	  order.getTerms1().click();
	  order.getTerms2().click();
	 
//   14.	Click on pay cheque 
	  order.getPayByCheque().click();
	 
//	 15.Proceed to order
	  order.getConnfirmOrder().click();
	 
	//Get Text
	  String ConfirmationText=order.getText1().getText();
	  
	  // Verify that Product is ordered
	  if(ConfirmationText.contains("complete")) {
	   System.out.println("Order Completed: Test Case Passed");
	  }
	  else {
	   System.out.println("Order Not Successfull: Test Case Failed");
	  }
	 // sign out
	  order.getSignOut().click();	  
}
}