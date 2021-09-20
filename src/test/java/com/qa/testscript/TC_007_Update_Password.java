package com.qa.testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_007_Update_Password extends TestBase{
	
	@Test
	public void update_password()
	{
		update_Password_Pages.getPersonal_info().click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,550)", "");
         update_Password_Pages.getOld_pswd().sendKeys("596844");
         String pswd="596844";
         String cpaswd="596844";
         update_Password_Pages.getNew_pswd().sendKeys(pswd);;
         update_Password_Pages.getConfirm_paswd().sendKeys(cpaswd);
         if(pswd.contains(cpaswd))
         {
        	 Assert.assertTrue(true);
        	 System.out.println("both passwords are same");
         }
         else
         {
        	 Assert.assertTrue(false);
        	 System.out.println("both passwords not are same");
         
         }

	}

}
