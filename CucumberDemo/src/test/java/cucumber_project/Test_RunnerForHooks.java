package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		//strict =true,
		monochrome = true,
		features = {"src\\test\\resources\\FeatureForHooks"},
		glue = {"Hooks"}
	
		
	)
public class Test_RunnerForHooks {
	
}
