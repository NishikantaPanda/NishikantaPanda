package org.vtiger.Organization;

   import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vtiger.genericUtilities.BaseClass;
import com.vtiger.objectRepo.CreateNewOrgnizationPage;
import com.vtiger.objectRepo.HomePage;
import com.vtiger.objectRepo.OrgInfoPage;
import com.vtiger.objectRepo.OrgPage;

public class CreateOrganizationTest extends BaseClass{

	@Test(retryAnalyzer = com.vtiger.genericUtilities.RetryAnalyserImplementation.class)
	public void createOrganization()throws EncryptedDocumentException, IOException, InterruptedException  {
		
	HomePage hp = new HomePage(driver);
	hp.clickOnOrgLink(driver);
	OrgPage op = new OrgPage(driver);
	op.clickOnOrgBtn();
	CreateNewOrgnizationPage cnop = new CreateNewOrgnizationPage(driver);
	String ORGNAME = eUtil.readDataFromExcel("Sheet1", 1, 4)+jUtil.getRandomNumber();
	cnop.createNewOrg(driver, ORGNAME, "www.stockholm.com", "9987450013", "noWhere@yahoo.com");
	
	 //contact info page will open
	 
	 OrgInfoPage cip = new OrgInfoPage(driver);
	 
	// Get Header info
	 String header = cip.getLe().getText();
	 System.out.println(header);
	 String Last_Name=eUtil.readDataFromExcel("Sheet1", 1, 3);
	 
	 if(header.contains(Last_Name)) {
		 Assert.assertTrue(true);
	 }
	 
	 else
		 Assert.assertTrue(false, " Header Info mismatched");
	 
	 //Close browser and close Database conncetion is done
	
	
	}
}
