package com.qa.testscript;

import org.testng.annotations.Test;

public class TC_009_Registration extends TestBase {

	@Test
	public void Account() throws InterruptedException {
		signout_Pages.getSignOut().click();
		sp3.getSignIn().click();
		sp3.getCreateAccount().sendKeys("bhg45444@gmail.com");
		Thread.sleep(2000);
		sp3.getCreateBtn().click();
		Thread.sleep(20000);
		sp3.getGender().click();
		sp3.getFirstname().sendKeys("smith");
		sp3.getLname().sendKeys("kim");
		sp3.getPassword().sendKeys("1@06ud");
		sp3.getFirst().sendKeys("Smithd");
		sp3.getLast().sendKeys("Kimd");
		sp3.getCompany().sendKeys("google");
		sp3.getAddress1().sendKeys("UK");
		sp3.getAddress2().sendKeys("Texas");
		sp3.getCity().sendKeys("U.K");
		sp3.getState().selectByVisibleText("Florida");
		sp3.getPostcode().sendKeys("32118");
		sp3.getCountry().selectByVisibleText("United States");
		sp3.getOther().sendKeys("hii helllo");
		sp3.getPhone().sendKeys("123456");
		sp3.getPhone_mobile().sendKeys("54321");
		sp3.getAlias().sendKeys("asdfg");
		sp3.getRegister1().click();

	}

}
