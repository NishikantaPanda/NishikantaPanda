package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {

	@FindBy(xpath="//span[contains(text(),'Panda')]")
	private WebElement le;
	
	
	
	public OrgInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getLe() {
		return le;
	}
	
	
}
