package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = { "pretty",
       //         "html:target/site/cucumber-pretty",
       //         "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber.json","" +
       //         "junit:target/cucumber-results.xml" },

        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags= "@run",
        dryRun = false
)


public class Runners {
}
