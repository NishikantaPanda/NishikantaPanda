package com.vtiger.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DuplicateOrg {

	@FindBy(name="accountname")
	private WebElement orgNameDuptb;
	
	@FindBy(name="website")
	private WebElement websiteNameDuptb;
	
	@FindBy(name="industry")
	private List<WebElement> industryDupDD;
	
	@FindBy(name="accounttype")
	private List<WebElement> typeDupDD;
	
	@FindBy(name="emailoptout")
	private WebElement emailOptDupCheckBox;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement assignToOptDupCheckBox1;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignToOptDupCheckBox2;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignToDupDD;
	
	@FindBy(id="phone")
	private WebElement phoneDuptb;
	
	@FindBy(id="fax")
	private WebElement faxDuptb;
	
	@FindBy(id="email1")
	private WebElement emailDuptb;
	
	@FindBy(name="rating")
	private WebElement ratingDupDD;
	
	@FindBy(name="annual_revenue")
	private WebElement annualRevenueDuptb;
	
	
	@FindBy(name="notify_owner")
	private WebElement notifyOwnerDupCheckBox;
	
	@FindBy(xpath="//b[text()='Copy Shipping address']")
	private WebElement copyShipAddressDupCheckBox;
	
	@FindBy(xpath="//b[text()='Copy Billing address']")
	private WebElement copyShipBillDupCheckBox;
	
	@FindBy(name="bill_street")
	private WebElement billAddressDupBox;
	
	@FindBy(id="bill_pobox")
	private WebElement billPostNameDupBox;
	
	@FindBy(id="bill_city")
    private WebElement billCityDupBox;
	
	@FindBy(id="bill_state")
    private WebElement billStateDupBox;
	
	@FindBy(id="bill_code")
    private WebElement billPostCodeDupBox;
	
	@FindBy(id="bill_country")
    private WebElement billCountryDupBox;
	
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement dupSavebtn;
	
	@FindBy(xpath="(//input[@name='button'])[4]")
	private WebElement dupCancelbtn;
}
