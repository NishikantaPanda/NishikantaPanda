package com.practice.Automation;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase002 {

	@Test
	public void Test02() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Login to Application vtiger.
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitbutton")).click();
		
		// Step 2: click on Contacts module
		
		driver.findElement(By.linkText("Contacts")).click();
		
		Thread.sleep(2000);
		
		// Step 3: click on search button
		
		driver.findElement(By.xpath("//img[@alt='Search in Contacts...']")).click();
		
		// Step 4:click on check box
		
		driver.findElement(By.xpath("(//input[@name='selected_id'])[2]")).click();
		
		Thread.sleep(2000);
		
		// Step 5: click on delete button
		
		driver.findElement(By.xpath("(//input[@value='Delete'])[2]")).click();
		
		// Step 6: Switch to alert and click on ok.
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		// close the browser
		
		driver.close();
		
	}

}
