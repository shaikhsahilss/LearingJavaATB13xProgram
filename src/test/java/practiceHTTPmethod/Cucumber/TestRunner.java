package practiceHTTPmethod.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Sahil\\IdeaProjects\\APIAutomationFrameWork\\src\\test\\java\\practiceHTTPmethod\\Cucumber\\login.feature",
        glue = {"stepDefination"},
        plugin = {"pretty", "html"},// Make sure this package name is correct
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

