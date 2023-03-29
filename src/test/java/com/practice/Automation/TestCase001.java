package com.practice.Automation;

import org.testng.annotations.Test;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase001 {

	@Test
	public void Test001() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Login to Application vtiger
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitbutton")).click();
		
		// Step 2: click on Contacts module
		driver.findElement(By.linkText("Contacts")).click();
		
		// Step 3 : click + icon
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		// Step 4 : fill all necessary field details 
		
		driver.findElement(By.name("lastname")).sendKeys("Biswal");
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
