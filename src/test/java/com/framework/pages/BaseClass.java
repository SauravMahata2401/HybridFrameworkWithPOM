package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.framework.utility.BrowserFactory;
import com.framework.utility.ConfigDataProvider;
import com.framework.utility.ExcelDataProvider;
import com.framework.utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuits(){
		
		excel= new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp(){
		
		driver =BrowserFactory.startApplication(driver, config.getDatafromConfig("Broswer"), config.getDatafromConfig("url"));
	}
	
	@AfterClass
	public void tearDown(){
		
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			Helper.captureScreenshot(driver, result.getName());
		}
	}
	

}
