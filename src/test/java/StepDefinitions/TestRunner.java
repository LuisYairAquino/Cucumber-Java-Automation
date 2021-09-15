package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports.html", "json:target/report.json", "junit:target/report.xml"},
tags="@smoketest")
//plugin = {"pretty", "json:target/report.json"},
//plugin = {"pretty", "junit:target/JUnitReports/report.xml"}) this is with folder inside target folder
public class TestRunner {

	
}
