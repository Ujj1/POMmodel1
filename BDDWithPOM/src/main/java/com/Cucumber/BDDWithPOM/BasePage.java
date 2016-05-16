package com.Cucumber.BDDWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public void loginPage(WebDriver driver)
    {
        this.driver=driver;
    }

  static WebDriver  driver = new FirefoxDriver();

	WebDriver.Timeouts timeout = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


public void closeBrowser() {
    driver.quit();
}
}