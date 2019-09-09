package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='txtUsername']") WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']") WebElement password;
	
	@FindBy(xpath="//input[@value='LOGIN']") WebElement loginbtn;
	
	
	public void LoginApplication(String uname,String pass){
		
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}

}
