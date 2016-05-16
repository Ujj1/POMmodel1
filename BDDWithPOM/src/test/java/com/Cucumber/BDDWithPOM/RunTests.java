package com.Cucumber.BDDWithPOM;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format ={ "html:target/CucumberReports"},
                             tags="login",
                             features = "src/test/java/features")
public class RunTests {

}
