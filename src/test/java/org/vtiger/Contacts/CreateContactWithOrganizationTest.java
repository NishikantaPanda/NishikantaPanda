package org.vtiger.Contacts;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vtiger.genericUtilities.BaseClass;
import com.vtiger.objectRepo.ContactInfoPage;
import com.vtiger.objectRepo.ContactPage;
import com.vtiger.objectRepo.CreateNewContactPage;
import com.vtiger.objectRepo.HomePage;
import com.vtiger.objectRepo.OrgPage;

public class CreateContactWithOrganizationTest extends BaseClass {
	
		
		
		@Test(retryAnalyzer = com.vtiger.genericUtilities.RetryAnalyserImplementation.class,groups="SmokeSuite")
		public void createContactWithOrg() throws EncryptedDocumentException, IOException, InterruptedException {
			
			// After Execution of @BeforeMethod HomePage will Open
			HomePage hp = new HomePage(driver);
			
			//click on contact link
			hp.clickOnContactLink(driver);
			
			//Contact Page will open
			ContactPage cp = new ContactPage(driver);
			
			//click on create contact plus button
			cp.clickOnCreateContactButton(driver);
			
	
			//Create new contact page will open
			CreateNewContactPage cncp = new CreateNewContactPage(driver);
			
			//give all necessary details and click on save button
			
			 String Last_Name=eUtil.readDataFromExcel("Sheet1", 1, 3);
			 String Child_Page_Title=eUtil.readDataFromExcel("Sheet1", 1, 5);
			 String Parent_Page_Title = eUtil.readDataFromExcel("Sheet1", 1, 6);
			 String Org_Name=eUtil.readDataFromExcel("Sheet1", 1, 4);
			 String First_Name=eUtil.readDataFromExcel("Sheet1", 1, 8);
			 cncp.createNewContact(Last_Name, First_Name, driver, Org_Name,Parent_Page_Title,Child_Page_Title);
		
			 
			 //contact info page will open
			 
			 ContactInfoPage cip = new ContactInfoPage(driver);
			 
			 //Get Header info
			 String header = cip.getContactInfoHeader().getText();
			 System.out.println(header);
			 
			 if(header.contains(Last_Name)) {
				 Assert.assertTrue(true);
			 }
			 
			 else
				 Assert.assertTrue(false, " Header Info mismatched");
			 
			 //Close browser and close Database conncetion is done
			}
			
		}
        



