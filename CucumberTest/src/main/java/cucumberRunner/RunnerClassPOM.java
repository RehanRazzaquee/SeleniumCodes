package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features= {"src/main/java/cucumberPom/CreateLeadPOM.feature"},glue= {"hooksPack","pages"})
@RunWith(Cucumber.class)
public class RunnerClassPOM {

}
