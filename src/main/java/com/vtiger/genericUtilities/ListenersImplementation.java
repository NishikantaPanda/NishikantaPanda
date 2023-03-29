package com.vtiger.genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.webDriverUtilities.WebDriverUtility;

/**
 * This class contains implementationn for ITestListeners interface of TestNG
 * @author Nishikant P
 *
 */
public class ListenersImplementation implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) { // This will work on @Test Method start
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" --- Execution started");
		
		test = report.createTest(methodName);
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		
		test.log(Status.PASS, methodName+" --- PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		
		JavaUtility jUtil = new JavaUtility();
		WebDriverUtility wUtil = new WebDriverUtility();
		
		String methodName = result.getMethod().getMethodName();
		test.log(Status.FAIL, methodName+" --- FAIL");
		test.log(Status.INFO, result.getThrowable());
		
		String ScreenshotName = methodName+"-"+jUtil.getSystemDateAndTimeInSpecificFormat();
		
		try {
			String path = wUtil.takeScreenShot(BaseClass.sDriver, ScreenshotName);
			
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();		
		
		test.log(Status.SKIP, methodName+"---SKIP");
		test.log(Status.INFO, result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport= new ExtentSparkReporter(".//ExtentReports//Report-"+new JavaUtility().getSystemDateAndTimeInSpecificFormat()+"html");
		
		htmlreport.config().setDocumentTitle("Vtiger Execution Report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("VTIGER EXECUTION REPORT");
		report= new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base Url", "http://localhost:8888");
		report.setSystemInfo("Base Browser", "Mozilla Firefox");
		report.setSystemInfo("Reporter Name", "Nishikanta Panda");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Suite Execution Finished");
		report.flush();
	}
	
	
	
	

}
