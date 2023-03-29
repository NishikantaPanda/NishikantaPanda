package com.practice.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {

	@Test(retryAnalyzer = com.vtiger.genericUtilities.RetryAnalyserImplementation.class)
	public void test() {
		System.out.println("Hello From Nishikant");
		Assert.fail();
	}
}
