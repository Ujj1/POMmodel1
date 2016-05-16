package com.POMmodel;

/**
 * Created by suzi on 04/05/16.
 */

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

