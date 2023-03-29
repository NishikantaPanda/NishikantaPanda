package com.vtiger.objectRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.webDriverUtilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility {

	//Identify and Declare WebElement
	@FindBy(name="salutationtype")
	private WebElement nameTypeDD;
	
	
	@FindBy(name="firstname")
	private WebElement firstNametb;
	
	
	@FindBy(name="lastname")
	private WebElement lastNametb;
	
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@alt='Select']")
	private WebElement chooseOrgBtn;
	
	
	@FindBy(name="leadsource")
	private WebElement leadSourceDD;
	
	
	@FindBy(id="department")
	private WebElement departmenttb;
	
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	
	@FindBy(name="assistant")
	private WebElement assistantNametb;
	
	
	@FindBy(name="assistantphone")
	private WebElement assistantPhonetb;
	
	
	@FindBy(name="emailoptout")
	private WebElement emailOptCheckBox;
	
	
	@FindBy(name="mobile")
	private WebElement mobiletb;
	
	
	@FindBy(id="fax")
	private WebElement faxtb;
	
	
	@FindBy(name="birthday")
	private WebElement birthDateSelect;
	
	
	@FindBy(xpath="(//img[@title='Select'])[2]")
	private WebElement reportTOBtn;
	
	
	@FindBy(name="donotcall")
	private WebElement doNotCallCheckBox;
	
	@FindBy(xpath="(//input[@name='assigntype'])[1]")
	private WebElement assignRadio;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchNowBtn;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchBoxtb;
	
	
	//Initializing WebElement with the Help of Constructor
	public CreateNewContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	//creating getters and setters for WebElements
	public WebElement getNameTypeDD() {
		return nameTypeDD;
	}


	public WebElement getFirstNametb() {
		return firstNametb;
	}


	public WebElement getLastNametb() {
		return lastNametb;
	}


	public WebElement getChooseOrgBtn() {
		return chooseOrgBtn;
	}


	public WebElement getLeadSourceDD() {
		return leadSourceDD;
	}


	public WebElement getDepartmenttb() {
		return departmenttb;
	}


	public WebElement getEmailtb() {
		return emailtb;
	}


	public WebElement getAssistantNametb() {
		return assistantNametb;
	}


	public WebElement getAssistantPhonetb() {
		return assistantPhonetb;
	}


	public WebElement getEmailOptCheckBox() {
		return emailOptCheckBox;
	}


	public WebElement getMobiletb() {
		return mobiletb;
	}
	
	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}


	public WebElement getSearchBoxtb() {
		return searchBoxtb;
	}


	public WebElement getFaxtb() {
		return faxtb;
	}


	public WebElement getBirthDateSelect() {
		return birthDateSelect;
	}


	public WebElement getReportTOBtn() {
		return reportTOBtn;
	}


	public WebElement getDoNotCallCheckBox() {
		return doNotCallCheckBox;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	public void selectNameType(WebDriver driver , String Text) {
	  handleDropdown(nameTypeDD, Text);
		
	}
	
	public void enterLastName(String LASTNAME) {
		lastNametb.sendKeys(LASTNAME);
	}
	
	public void enterFirstName(String FIRSTNAME) {
		firstNametb.sendKeys(FIRSTNAME);
	}

	public void chooseOrgLookUp(WebDriver driver) {
		doubleClickAction(driver, chooseOrgBtn);
	}
	
	public void chooseLeadSourceDD(String SOURCE) {
	   handleDropdown(SOURCE, leadSourceDD);
	}
	
	public void giveEmail(String EMAIL) {
		emailtb.sendKeys(EMAIL);
	}
	
	public void giveDepartment(String DEPARTMENT) {
		departmenttb.sendKeys(DEPARTMENT);
	}
	
	public void chooseEmailOpt(WebDriver driver) {
		doubleClickAction(driver, emailOptCheckBox);
	}
	
	public void enterAssistantName(String ASSIST_NAME) {
		assistantNametb.sendKeys(ASSIST_NAME);
	}
	
	public void enterAssistantPhone(String PHONE_NO) {
		assistantPhonetb.sendKeys(PHONE_NO);
	}
	
	public void enterMobileNo(String MOBILE) {
		mobiletb.sendKeys(MOBILE);
	}
	
	public void enterFax(String FAX) {
		faxtb.sendKeys(FAX);
	}
	
	


	public void selectBirthDate(WebDriver driver) {
		doubleClickAction(driver, birthDateSelect);
	}
	
	public void selectDoNotCallCheckBox(WebDriver driver) {
		doubleClickAction(driver, doNotCallCheckBox);
	}
	
	public void clickSave(WebDriver driver) {
		doubleClickAction(driver, saveBtn);
	}
	
	//Business Library to Create contact with FirstName, LastName, OrgName
	public void createNewContact(String LASTNAME,String FIRSTNAME,WebDriver driver,String ORGNAME,String Parent_Page_Name, String Child_Page_Name) {
		lastNametb.sendKeys(LASTNAME);
		firstNametb.sendKeys(FIRSTNAME);
		chooseOrgBtn.click();
		switchToWindow(driver, "Accounts");
		searchBoxtb.sendKeys(ORGNAME);
		searchNowBtn.click();
		driver.findElement(By.xpath("//a[text()='"+ORGNAME+"']")).click();
		switchToWindow(driver, "Contacts");
		saveBtn.click();
		
	}
	
	
	
	
	
	
	
	
}
