package com.framework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pages.BaseClass;
import com.framework.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void testLoginApp(){
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);

		loginPage.LoginApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		
	}

}
