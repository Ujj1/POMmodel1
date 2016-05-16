package com.POMmodel;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by suzi on 05/05/16.
 */
public class stepDefs {
    public static WebDriver driver;
    public static String Test_URL = "http://sriram-001-site1.ctempurl.com/";
    LoginPage login = new LoginPage();


    @Before
    public void start() {
        System.out.println("OPening Browser");
        driver = new FirefoxDriver();
        driver.get("http://sriram-001-site1.ctempurl.com/");
        System.out.println("entering home page");
        driver.manage().window().maximize();
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }



    @Given("^Admin is on the homepage$")
    public void adminIsOnTheHomepage() throws Throwable
    {
        Assert.assertTrue(Test_URL.contains("http://sriram-001-site1.ctempurl.com/"));

        System.out.println("Hello");


    }

    @When("^Admin enter userID$")
    public void adminEnterUserID() throws Throwable{

        System.out.println("User ID is here");
        login.userID();


    }

    @And("^Admin enter password$")
    public void adminEnterPassword() throws Throwable {
        login.passWord();


    }

    @And("^Admin click login button$")
    public void adminClickLoginButton() throws Throwable {
        login.loginButton();
    }

    @Then("^Admin can enter employment management system$")
    public void adminCanEnterEmploymentManagementSystem() throws Throwable {



    }
}