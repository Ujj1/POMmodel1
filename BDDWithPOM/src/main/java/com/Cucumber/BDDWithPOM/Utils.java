package com.Cucumber.BDDWithPOM;

import org.openqa.selenium.By;

public class Utils extends BasePage{
	
	public static boolean isTextPresent(By element,String text)
	{
		return driver.findElement(element).getText().contains(text);
	}

	public static boolean isElementPresent(By element)
	{
		return driver.findElement(element).isDisplayed();
	}
	
}
