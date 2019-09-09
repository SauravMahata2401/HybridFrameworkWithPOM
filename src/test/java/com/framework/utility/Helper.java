package com.framework.utility;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
	public static void captureScreenshot(WebDriver driver,String screenshotName){
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    try {
	    	
	        FileHandler.copy(src, new File("./Screenshots/Fail_"+screenshotName+".png"));
	        
	    } catch (Exception e) {
	    	System.out.println("Unable to take Screenshot: "+e.getMessage());
	    } 
		
	}

	
	public static String getCurrentDateTime(){
		
	    DateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH:mm:ss");  
		Date date = new Date();  
		return formatter.format(date);
	}
}
