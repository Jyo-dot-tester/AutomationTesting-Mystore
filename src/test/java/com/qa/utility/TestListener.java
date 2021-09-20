package com.qa.utility;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestListener implements ITestListener {

	public static ExtentReports extentReports = ExtentReporterManager.createInstance();

	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
			ExtentTest test=extentReports.createTest(result.getTestClass().getName()+"::"
		                                             +result.getMethod().getMethodName());
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String logtext="<center><b>Test method "+result.getMethod().getMethodName()+" Success</b></center>";
		Markup label = MarkupHelper.createLabel(logtext, ExtentColor.GREEN);
		extentTest.get().log(Status.PASS, label);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String excMessage = Arrays.toString(result.getThrowable().getStackTrace());
		extentTest.get().fail("<details><summary><b><font color=red>Exception Occured, click to see details:"
				+ "</font></b></summary>" + excMessage.replaceAll(",", "<br>") + "</details>\n");

		String logtext="<b> Test method "+result.getMethod().getMethodName()+" Failed</b>";
		Markup label = MarkupHelper.createLabel(logtext, ExtentColor.RED);
		extentTest.get().log(Status.FAIL, label);
		
		ITestContext context = result.getTestContext();
	    WebDriver driver = (WebDriver) context.getAttribute("WebDriver");
        try {
        	TakeScreenShot screenShot = new TakeScreenShot();
            String screenshotpath = screenShot.takeScreenShot(result.getName().toString(),driver);
            extentTest.get().fail("<b><font>"+"Screenshot of failure"+"</font></b>", MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
          		  
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

		

	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		String logtext="<center><b> Test method "+result.getMethod().getMethodName()+" Skipped</b></center>";
		Markup label = MarkupHelper.createLabel(logtext, ExtentColor.YELLOW);
		extentTest.get().log(Status.SKIP, label);

	}
	
	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

	
	
}
