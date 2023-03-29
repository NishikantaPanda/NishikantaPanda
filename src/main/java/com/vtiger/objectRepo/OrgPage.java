package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.webDriverUtilities.WebDriverUtility;

public class OrgPage extends WebDriverUtility{

	
	// identifyall required Web Element and store them
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgBtn;
	
	@FindBy(xpath="//img[@alt='Search in Organizations...']")
	private WebElement searchOrgbtn;
	
	
	
	@FindBy(name="selectall")
	private WebElement selectAllOrgbox;
	
	
	@FindBy(xpath="(//input[@value=\"Delete\"])[1]")
	private WebElement deletebtn;
	
	//Initialize WebElements with the help of constructor
	public OrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Creating getters for above private elements to achieve Encapsulation

	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}

	public WebElement getSearchOrgbtn() {
		return searchOrgbtn;
	}

	public WebElement getSelectAllOrgbox() {
		return selectAllOrgbox;
	}
	
	public WebElement getDeletebtn() {
		return deletebtn;
	}

	//Business Library
	public void clickOnOrgBtn() {
		createOrgBtn.click();
	}
	
	

	

	
	
	
	
	
	
}
