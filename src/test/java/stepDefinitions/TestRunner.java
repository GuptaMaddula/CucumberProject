package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefinitions"},
monochrome=true,
plugin={"pretty","junit:target/Reports/report.xml"})
public class TestRunner {

}
