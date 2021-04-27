package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/cucumber/", glue = "cucumber")
public class CucumberRunner extends AbstractTestNGCucumberTests {
}