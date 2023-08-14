package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber", glue="harunaltunhwe.stepDefinitions",
monochrome=true, tags = "@landingPage", plugin = {"html:target/cucumber.html"})
//change the reporting (insert in plugin)--> maybe in Extent Report ?
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
