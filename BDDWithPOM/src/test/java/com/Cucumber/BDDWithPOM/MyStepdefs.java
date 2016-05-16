package com.Cucumber.BDDWithPOM;

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
 * Created by suzi on 04/05/16.
 */
public class MyStepdefs {


    WebDriver driver;
    String Test_URL = "http://sriram-001-site1.ctempurl.com/";
    LoginPage login = new LoginPage();


    @Before
    public void start() {
        this.driver = driver;
        driver = new FirefoxDriver();
        driver.get(Test_URL);
        driver.manage().window().maximize();
    }


    @Given("^Admin is on the homepage$")
    public void admin_is_on_the_homepage() throws Throwable {
        driver.get("http://sriram-001-site1.ctempurl.com/");
        System.out.println("Hello");




    }

    @When("^Admin enter userID$")
    public void admin_enter_username() throws Throwable {
        login.userId();


    }

    @And("^Admin enter password$")
    public void admin_enter_password() throws Throwable {
        login.passWord();


    }

    @And("^Admin click login button$")
    public void admin_click_login_button() throws Throwable {
        login.loginButton();
    }

    @Then("^Admin can enter employment management system$")
    public void admin_can_enter_employment_management_system() throws Throwable {


    }




    @After
    public void closeBrowser() {
        driver.quit();
    }
}



