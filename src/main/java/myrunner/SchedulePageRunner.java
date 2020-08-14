package myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/java/Features/SchedulePage.feature"
        ,glue = {"stepDefinition"}
        ,dryRun = false
        ,plugin = {"pretty","html:target/cucumber"}


)

public class SchedulePageRunner {
}
