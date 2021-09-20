package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_002_OrderProduct extends TestBase {

	@Test
	public void buyProduct() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//	  1. Move your cursor over Women's link.
		order.getWomenLink().click();

//	  2. Click on sub menu 'T-shirts'.
		order.getTshirtsLink().click();

//	  3. Mouse hover on the first product displayed.
//	  4. 'More' button will be displayed, click on 'More' button.
		Actions actions = new Actions(driver);
		actions.moveToElement(order.getImage()).moveToElement(order.getMoreBtn()).click().perform();

//	  5. Increase quantity to 2.
		order.getQuantity().clear();
		order.getQuantity().sendKeys("2");

//	  6. Select size 'M'
		order.getSize().selectByVisibleText("M");

//	  7. Select color.
		order.getColor().click();

//	  8. Click 'Add to Cart' button.
		order.getAddTocart().click();

//	  9. Click 'Proceed 
		order.getProceed().click();

//   10. click proceed to checkout
		order.getPageProceed().click();
		order.getPagecheckout().click();

//	  11. Complete the buy order process till payment.
		order.getTerms1().click();
		order.getTerms2().click();

//   12.	Click on pay cheque 
		order.getPayByCheque().click();

//	 13.Proceed to order
		order.getConnfirmOrder().click();

		// Get Text
		String ConfirmationText = order.getText1().getText();

		// Verify that Product is ordered
		if (ConfirmationText.contains("complete")) {
			System.out.println("Order Completed: Test Case Passed");
		} else {
			System.out.println("Order Not Successfull: Test Case Failed");
		}
		// sign out
		order.getSignOut().click();
	}
}