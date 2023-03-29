package com.vtiger.objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgnizationPage {

	//store and idnetify required WebElement
	
	@FindBy(name="accountname")
	private WebElement orgNametb;
	
	@FindBy(name="website")
	private WebElement websiteNametb;
	
	@FindBy(name="industry")
	private List<WebElement> industryDD;
	
	@FindBy(name="accounttype")
	private List<WebElement> typeDD;
	
	@FindBy(name="emailoptout")
	private WebElement emailOptCheckBox;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement assignToOptCheckBox1;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignToOptCheckBox2;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignToDD;
	
	@FindBy(id="phone")
	private WebElement phonetb;
	
	@FindBy(id="fax")
	private WebElement faxtb;
	
	@FindBy(id="email1")
	private WebElement emailtb;
	
	@FindBy(name="rating")
	private WebElement ratingDD;
	
	@FindBy(name="annual_revenue")
	private WebElement annualRevenuetb;
	
	
	@FindBy(name="notify_owner")
	private WebElement notifyOwnerCheckBox;
	
	@FindBy(xpath="//b[text()='Copy Shipping address']")
	private WebElement copyShipAddressCheckBox;
	
	@FindBy(xpath="//b[text()='Copy Billing address']")
	private WebElement copyShipBillCheckBox;
	
	@FindBy(name="bill_street")
	private WebElement billAddressBox;
	
	@FindBy(id="bill_pobox")
	private WebElement billPostNameBox;
	
	@FindBy(id="bill_city")
    private WebElement billCityBox;
	
	@FindBy(id="bill_state")
    private WebElement billStateBox;
	
	@FindBy(id="bill_code")
    private WebElement billPostCodeBox;
	
	@FindBy(id="bill_country")
    private WebElement billCountryBox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="(//input[@name='button'])[4]")
	private WebElement cancelbtn;
	
	@FindBy(xpath="(//input[@value='Duplicate'])[1]")
	private WebElement duplicatebtn;
	
	//initialize elements using constructor
	public CreateNewOrgnizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Creating getters for above private elements to achieve Encapsulation

	public WebElement getOrgNametb() {
		return orgNametb;
	}

	public WebElement getWebsiteNametb() {
		return websiteNametb;
	}

	public List<WebElement> getIndustryDD() {
		return industryDD;
	}

	public List<WebElement> getTypeDD() {
		return typeDD;
	}

	public WebElement getEmailOptCheckBox() {
		return emailOptCheckBox;
	}

	public WebElement getAssignToOptCheckBox1() {
		return assignToOptCheckBox1;
	}

	public WebElement getAssignToOptCheckBox2() {
		return assignToOptCheckBox2;
	}

	public WebElement getAssignToDD() {
		return assignToDD;
	}

	public WebElement getPhonetb() {
		return phonetb;
	}

	public WebElement getFaxtb() {
		return faxtb;
	}

	public WebElement getEmailtb() {
		return emailtb;
	}

	public WebElement getRatingDD() {
		return ratingDD;
	}

	public WebElement getAnnualRevenuetb() {
		return annualRevenuetb;
	}

	public WebElement getNotifyOwnerCheckBox() {
		return notifyOwnerCheckBox;
	}

	public WebElement getCopyShipAddressCheckBox() {
		return copyShipAddressCheckBox;
	}

	public WebElement getCopyShipBillCheckBox() {
		return copyShipBillCheckBox;
	}

	public WebElement getBillAddressBox() {
		return billAddressBox;
	}

	public WebElement getBillPostNameBox() {
		return billPostNameBox;
	}

	public WebElement getBillCityBox() {
		return billCityBox;
	}

	public WebElement getBillStateBox() {
		return billStateBox;
	}

	public WebElement getBillPostCodeBox() {
		return billPostCodeBox;
	}

	public WebElement getBillCountryBox() {
		return billCountryBox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}
	
	
	//Business Library
	
	public void createNewOrg(WebDriver driver,String ORGNAME,String WEBSITE,String PHONE,String EMAIL ) {
		OrgPage op = new OrgPage(driver);
		op.clickOnOrgBtn();
		orgNametb.sendKeys(ORGNAME);
		websiteNametb.sendKeys(WEBSITE);
		emailOptCheckBox.click();
		phonetb.sendKeys(PHONE);
		emailtb.sendKeys(EMAIL);
		savebtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
