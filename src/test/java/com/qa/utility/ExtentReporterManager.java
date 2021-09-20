package com.qa.utility;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterManager {
	
	private static ExtentReports extentReports;
	
	public static ExtentHtmlReporter extentHtmlReporter;
	
	public static ExtentReports createInstance() {
		String format = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String extentReport="Test-Execution-Report"+format+".html";
		extentHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/"+extentReport);
		extentHtmlReporter.config().setDocumentTitle("Popup1 Automation Testing");
		extentHtmlReporter.config().setReportName("Functional Testing");
		extentHtmlReporter.config().setTheme(Theme.DARK);

		extentReports = new ExtentReports();
		extentReports.setSystemInfo("Hostname", "Localhost");
		extentReports.setSystemInfo("os", "Windows");
		extentReports.setSystemInfo("Tester", "Naga Jyothi");
		extentReports.attachReporter(extentHtmlReporter);
		 
		return extentReports;
	}
	
	
}
