package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot{
	public  String screenshotpath;
	
	public  String takeScreenShot(String methodName,WebDriver driver)
	{
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
        	String format = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            screenshotpath = System.getProperty("user.dir") + "/screenshot/" + methodName  +"_"+format+ ".png";
            
            //Copy the file to destination
            FileHandler.copy(scrFile, new File(screenshotpath));
            System.out.println("screenshot taken");
        }
        catch (IOException e) {
            System.out.println("screen shot not taken");
            e.printStackTrace();

        }
       return screenshotpath;
	}

}
