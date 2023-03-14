package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/"},
        dryRun = !true,
        glue = {"steps", "hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@goals"
)
public class Runner extends AbstractTestNGCucumberTests {
}
