package testDriver;


import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"Steps"}
)
public class Runner {
}
