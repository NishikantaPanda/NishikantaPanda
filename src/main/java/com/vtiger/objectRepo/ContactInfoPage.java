package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	//identify all WebElement and store it
	@FindBy(xpath="//span[contains(text(),'Panda')]")
	private WebElement contactInfoHeader;

	
	//Create getter and setter for WebElement to achieve Encapsulation(Utilization)
	public WebElement getContactInfoHeader() {
		return contactInfoHeader;
	}
	
	//Initialization
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
