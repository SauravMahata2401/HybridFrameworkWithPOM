package com.framework.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String AppURL){
		
		if(browserName.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			
			/*We will code it later*/
			
		}else{
			System.out.println("We don't Support that Browser..");
		}
		
		driver.get(AppURL);
		return driver;
	} 
	
	public static void quitBrowser(WebDriver driver){
		
		driver.quit();
	}

}
