package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/"},
        dryRun = true,
        glue = {"steps", "hooks"}

)
public class Runner extends AbstractTestNGCucumberTests {
}
