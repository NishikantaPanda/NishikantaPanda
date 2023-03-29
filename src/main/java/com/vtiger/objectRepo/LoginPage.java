package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//identify the required WebElement and store it
	@FindBy(name="user_name")
	private WebElement usernametb;
	
	@FindBy(name="user_password")
	private WebElement passwordtb;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	// Instantiate WebElements using Constructor
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	// Create getter and setter for above WebElements
	
	public WebElement getUsernametb() {
		return usernametb;
	}

	public WebElement getPasswordtb() {
		return passwordtb;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	// Create Business Library
	
	public void logInToApp(String username,String password  ) {
		usernametb.sendKeys(username);
		passwordtb.sendKeys(password);
		loginbtn.click();
	}
	
	
}
