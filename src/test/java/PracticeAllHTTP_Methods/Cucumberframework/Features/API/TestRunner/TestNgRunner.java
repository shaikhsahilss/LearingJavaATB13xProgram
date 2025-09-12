package PracticeAllHTTP_Methods.Cucumberframework.Features.API.TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",
glue = {"StepDefinations"}, monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html"})
public class TestNgRunner  {
}
