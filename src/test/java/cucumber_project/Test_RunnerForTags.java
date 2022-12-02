package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		//strict =true,
		monochrome = true,
		features = {"src\\test\\resources\\FeatureForTags"},
		glue = {"cucumber_project"},
		//tags= "@Smoke or @Regression"
		//tags= "@Smoke and @Regression"
		//tags="@Smoke and not @Regression"
		//tags= "@Regression and not @Smoke"
		//tags= "(@Regression or @Smoke) and @important"
		
		// tags= "@Regression or @Smoke and @important"
		tags="@mustRun"
	)
public class Test_RunnerForTags {
	
}
