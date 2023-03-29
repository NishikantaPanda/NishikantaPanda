package com.practice.Automation;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase003 {

	@Test
	public void Test03() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Login to Application vtiger
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitbutton")).click();
		
		//Step 3: Click on Organization Module
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//Step 4: Give Valid Credentials;
		driver.findElement(By.name("accountname")).sendKeys("TechSoft");
		driver.findElement(By.xpath("//input[@name='accountname']")).click();
		
		//Step 5: Click on save button
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		
		if(text.contains("TechSoft")) {
			System.out.println(text+"-----Pass");
		}
		
		else
			System.out.println("Failed");
		
		
		// Step 6: Logout of the Application
		
				Actions act = new Actions(driver);
				WebElement element = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
				act.moveToElement(element).perform();
				driver.findElement(By.linkText("Sign Out")).click();
				System.out.println("Sign out Successful");
				driver.quit();
	}

}
