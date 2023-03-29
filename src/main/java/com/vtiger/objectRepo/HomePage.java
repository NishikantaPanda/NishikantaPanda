package com.vtiger.objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.webDriverUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility {

	//store and idnetify required WebElement
	
	@FindBy(linkText = "Organizations")
	private WebElement orgLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement logoutMouseHover;
	
	@FindBy(xpath = "(//a[@class='drop_down_usersettings'])[2]")
	private WebElement signoutbtn;
	
	
	//Intialization
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Creating getters for above private elements to achieve Encapsulation(Utilization)

	public WebElement getOrglink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getLogoutMouseHover() {
		return logoutMouseHover;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	
	// Business Library
	
	
	   public void logOutOfApp(WebDriver driver) {
	      mouseHoverAction(driver, logoutMouseHover);
	      waitForElementToBeVisible(driver, logoutMouseHover);
	      doubleClickAction(driver, signoutbtn);
	   }
	   
	   public void clickOnContactLink(WebDriver driver) {
		   doubleClickAction(driver, contactLink); 
	   }
	   
	   public void clickOnOrgLink(WebDriver driver) {
		   doubleClickAction(driver, orgLink);
	   }
		
}
