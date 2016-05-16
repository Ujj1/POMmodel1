package com.POMmodel;

/**
 * Created by suzi on 04/05/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By userId = By.id("txtUserId");
    By password = By.id("txtPassword");
    By loginButton = By.id("btnSubmit");




    public void passWord()


    {
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
    }
    public void loginButton()

    {
        driver.findElement(loginButton).click();
    }


    public void userID() {
        driver.findElement(By.id("txtUserId")).sendKeys("Admin");

    }
}
