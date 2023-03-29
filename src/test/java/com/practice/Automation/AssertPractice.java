package com.practice.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {

	@Test(priority = 1, dependsOnMethods = "methodTwo")
	public void methodOne() {	
		System.out.println("Model 1");
		System.out.println("Model 2");
		Assert.assertEquals(false, true); // Soft Assert or Assert
		System.out.println("Model 3");
		System.out.println("Model 4");
		/*
		 *Model 1
		 *Model 2
		 *
		 */
	}
	
	@Test(priority = 3)
	public void methodTwo() {	
		System.out.println("Seond Test Model 1");
		System.out.println("second Test Model 2");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, false);
	//	Assert.assertEquals(false, true);
		System.out.println("Model 3");
		System.out.println("Model 4");
		sa.assertAll();
		
		/*
		 * Model 1
		 * Model 2
		 * Model 3
		 * Model 4
		 */
		
	}
	
	
}
