package com.practice.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.vtiger.genericUtilities.PropertyFileUtility;

public class DemoTestScriptWithDDT {

	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String BROWSER = p.getProperty("browser");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		FileInputStream fise = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fise);
		String LAST_NAME = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Explorer")) {
			driver= new InternetExplorerDriver();
		}
		else
		System.out.println("Invalid Driver Selection");
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Login to Application VTiger
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitbutton")).click();
		
		// Step 2: click on Contacts module
	driver.findElement(By.linkText("Contacts")).click();
		
		// Step 3 : click + icon
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		// Step 4 : fill all necessary field details 
		
		driver.findElement(By.name("lastname")).sendKeys(LAST_NAME);
		driver.findElement(By.name("assigntype")).click();
		WebElement element = driver.findElement(By.name("assigned_user_id"));
		Select s = new Select(element);
		s.selectByVisibleText(" Administrator");
		
		// click on save button
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		//close the browser
		
		driver.close();
		
		
	}
}
