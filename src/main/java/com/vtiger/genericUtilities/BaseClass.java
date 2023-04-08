package com.vtiger.genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.vtiger.objectRepo.*;

import com.vtiger.webDriverUtilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class consists of Basic configuration annotations of TestNG
 * @author Nishikant P
 *
 */
public class BaseClass {
	
	public PropertyFileUtility pUtil = new PropertyFileUtility();
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public static WebDriver sDriver; //listeners
	
	public WebDriver driver;
	
	@BeforeSuite(groups = {"SmokeSuite","RegressionSuite"})
	public void bsConfig()
	{
	   System.out.println("----- Database Connection successfull -----");
	}
    
	//@Parameters("browser")
	//@BeforeTest
	@BeforeClass(groups = {"SmokeSuite","RegressionSuite"})
	public void bcConfig() throws IOException
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		
		// Step 2: Launch the browser - runtime polymorphism
		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
					    options.addArguments("--no-sandbox");
					    driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			System.out.println("----- "+BROWSER+" Launched succesfully-----");
			
		} else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.firefox.driver", ".//geckodriver.exe");
			FirefoxOptions fo= new FirefoxOptions();
			fo.addArguments("--no-sandbox");
			driver = new FirefoxDriver(fo);
			System.out.println("----- "+BROWSER+" Launched successfully-----");
			
		} else 
		{
			System.out.println("Invalid Browser name");
		}

		sDriver=driver; // listeners
		wUtil.maximizeWindow(driver);
		wUtil.waitForPage(driver);
		driver.get(URL);
		
	}
	
	@BeforeMethod(groups = {"SmokeSuite","RegressionSuite"})
	public void bmConfig() throws IOException
	{
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		LoginPage lp = new LoginPage(driver);
		lp.logInToApp(USERNAME, PASSWORD);
		
		System.out.println("----- Login successful -----");
	}
	
	@AfterMethod(groups = {"SmokeSuite","RegressionSuite"})
	public void amConfig()
	{
		HomePage hp = new HomePage(driver);
		
		hp.logOutOfApp(driver);
		System.out.println("----- Logout successful -----");
	}
	
	@AfterClass(groups = {"SmokeSuite","RegressionSuite"})
	public void acConfig()
	{
		driver.quit();
		System.out.println("----- Browser Closed successfully -----");
	}
	
	@AfterSuite(groups = {"SmokeSuite","RegressionSuite"})
	public void asConfig()
	{
		System.out.println("----- Database Dis-Connection successfull -----");
		
	}
}



