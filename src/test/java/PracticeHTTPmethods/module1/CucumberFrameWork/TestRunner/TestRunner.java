package PracticeHTTPmethods.module1.CucumberFrameWork.TestRunner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src",
glue = {"stepdefination"},
plugin = {"pretty", "html:target/cucumber-reports.html",// HTML report
        "json:target/cucumber.json" },
monochrome = true,
dryRun =true,
tags = "@smoke")
public class TestRunner  {
}
