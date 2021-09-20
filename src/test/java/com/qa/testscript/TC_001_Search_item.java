package com.qa.testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_001_Search_item extends TestBase{  
	

	@Test(dataProvider="getData")
	public void searchTest(String Itemnames) {
	sp.getsearch().clear();
	sp.getsearch().sendKeys(Itemnames);
	sp.getmagnifierBtn().click();
	
	List<WebElement>itemNames=sp.getItemNamaes();
	for(WebElement item:itemNames)
		Reporter.log(item.getText(),true);
			
}
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\HP\\eclipse-workspace-latest\\Application_Mystore_Automation\\src\\test\\java\\com\\qa\\testdata\\mystoreexcel.xlsx";
		String xSheet="Sheet1";
		
		int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
			
		}
		
	return data;
}
}
