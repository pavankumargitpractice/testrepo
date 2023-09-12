package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
		
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
	logger.info("Url is opened");
	
	LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clicksubmit();
		logger.info("Clicked on submit button");
		
		if(driver.getTitle().equals("demo.guru99.com/test/success.html")) {
			Assert.assertTrue(true);
			logger.info("Login Test Info");
			
		} else {
			Assert.assertTrue(false);
			logger.info("Login Test FAIL");
		}
	}

}
