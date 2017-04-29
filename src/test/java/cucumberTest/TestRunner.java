package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by orson on 2017/4/22.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"}, plugin = {"json:target/cucumber.json"})
public class TestRunner {
}
