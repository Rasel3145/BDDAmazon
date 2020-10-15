package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/feature"} ,
        glue = {"stepdefinitions"} ,
        plugin ={"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true ,
        monochrome = true ,
        dryRun = false



)





public class Runner extends AbstractTestNGCucumberTests {
}
