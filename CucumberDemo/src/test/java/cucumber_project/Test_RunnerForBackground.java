package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		//strict =true,
		monochrome = true,
		features = {"src\\test\\resources\\BackgroundDemo\\background.feature"},
		glue = {"StepForBackground"},
		plugin = {"pretty","html:test-output/HTML-report/report.html", 
				"json:test-output/JSON-report/report.html" ,
				"junit:test-output/Junit-report/report.html"}
		
		
	)
public class Test_RunnerForBackground {
	
}
