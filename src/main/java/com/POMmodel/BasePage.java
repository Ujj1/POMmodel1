package com.POMmodel;

/**
 * Created by suzi on 04/05/16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
     static WebDriver driver;


   public void loginPage(WebDriver driver) {
 this.driver = driver;
   }


}

