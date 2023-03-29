package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatedOrgInfo {

	
	//Identify and Store all require WebElement
	
	@FindBy(xpath="//span[text()='[ ACC8 ] TeCh -  Organization Information']")
	private WebElement newOrgInfo;
	
	@FindBy(name="mapbutton")
	private WebElement mapLocatebtn;
	
	@FindBy(xpath="//textarea[contains(@id,'_ModComments')]")
	private WebElement commentsta;
	
	@FindBy(xpath="(//input[@value='Save'])[32]")
	private WebElement commentSavebtn;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	private WebElement deleteBtn;
	
	//Generating getters and setters for above Private Elements to achive Encapsulation

	public WebElement getNewOrgInfo() {
		return newOrgInfo;
	}

	public WebElement getMapLocatebtn() {
		return mapLocatebtn;
	}

	public WebElement getCommentsta() {
		return commentsta;
	}

	public WebElement getCommentSavebtn() {
		return commentSavebtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	
}
