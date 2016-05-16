package com.Cucumber.BDDWithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	WebDriver driver;

	By userId = By.id("txtUserId");
	By passWord = By.id("txtPassword");
	By loginButton = By.id("btnSubmit");





	
	

	
	public void userId()
	{
		driver.findElement(userId).sendKeys("Admin");

	}
	public void passWord()
	{
		driver.findElement(passWord).sendKeys("admin");
	}
	public void loginButton()
	{
		driver.findElement(loginButton).click();

		
	}

	
}
