package com.POMmodel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by suzi on 08/05/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/CucumberReports"},
        tags = "@login",
        features = "src/test/resources/")
public class RunTests {
}
