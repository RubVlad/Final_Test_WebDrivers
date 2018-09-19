package cucumberJava;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/cucumberJava"},
        //glue= {"stepDefinitions"},
        plugin = {"pretty","html:src/test//cucumber-reports"}
)
//@CucumberOptions(format = {"pretty", "html:target/cucumber"})

        public class runTest { }