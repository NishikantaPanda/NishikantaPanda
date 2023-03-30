package com.practice.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.objectRepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		LoginPage lp = new LoginPage(driver);
//		lp.getUsernametb().sendKeys("admin");
//		lp.getPasswordtb().sendKeys("admin");
//		lp.getLoginbtn().click();
		
		lp.logInToApp("admin", "admin");
		
		driver.close();
		
	}
}
