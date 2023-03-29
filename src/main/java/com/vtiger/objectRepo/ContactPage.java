package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.webDriverUtilities.WebDriverUtility;

public class ContactPage extends WebDriverUtility {

	
	//Identify and Store all require WebElement
	@FindBy(xpath="(//input[@type='button'])[8]")
	private WebElement deleteContactBtn;
	
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement searchBtn;
	
	
	@FindBy(name="search_text")
	private WebElement searchtb;
	
	
	@FindBy(name="search_field")
	private WebElement searchOptDD;
	
	
	@FindBy(name="selectall")
	private WebElement selectAllContactCheckBox;
	
	
	@FindBy(id="13")
	private WebElement selectedContactCheckBox;
	
	@FindBy(id="1")
	private WebElement chooseReportPerson;
	
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactBtn;
	
	
	//Initializing WebElement with the Help of Constructor
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Generating getters and setters for above Private Elements to achive Encapsulation


	public WebElement getDeleteContactBtn() {
		return deleteContactBtn;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}


	public WebElement getSearchtb() {
		return searchtb;
	}


	public WebElement getSearchOptDD() {
		return searchOptDD;
	}


	public WebElement getSelectAllContactCheckBox() {
		return selectAllContactCheckBox;
	}


	public WebElement getSelectedContactCheckBox() {
		return selectedContactCheckBox;
	}


	public WebElement getCreateContatBtn() {
		return createContactBtn;
	}
	
	
	//Business Library
	
	public void clickOnCreateContactButton(WebDriver driver) {
		doubleClickAction(driver, createContactBtn);
	}
	
	
	
	
	
	
	
	
}
