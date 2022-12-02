package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		//strict =true,
		monochrome = true,
		features = {"src\\test\\resources"},
		glue = {"cucumber_project"},
		plugin = {"pretty","html:test-output/HTML-report/report.html", "json:test-output/JSON-report/report.html" ,"junit:test-output/Junit-report/report.html"},
		tags= "@Firsttesting"
	)
public class Test_RunnerDemo {
	
}
