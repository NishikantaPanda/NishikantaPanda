package com.vtiger.genericUtilities;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class will retry failed Test Scripts
 * @author RR
 *
 */
public class RetryAnalyserImplementation implements IRetryAnalyzer {

	int count=0;
	int retryCount=3;
	
	/**
	 * This method will retry for specified number of  times on failed Script.
	 */
	public boolean retry(ITestResult result) { // What is the use of Result here
		while(count<retryCount) {
			count++;
		    return true;
		}
		
		return false;
	}

}
