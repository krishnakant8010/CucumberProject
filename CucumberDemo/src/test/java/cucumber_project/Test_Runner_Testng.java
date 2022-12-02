package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		//strict =true,
		monochrome = true,
		features = {"src\\test\\resources"},
		glue = {"cucumber_project"},
		plugin = {"pretty","html:target/report/test-report.html"},
		tags= "@Firsttesting"
	)

public class Test_Runner_Testng extends AbstractTestNGCucumberTests{

}
