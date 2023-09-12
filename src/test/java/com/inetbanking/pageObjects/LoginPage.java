package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="passwd")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="SubmitLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clicksubmit() {
		btnLogin.click();
	}
	
	
}
