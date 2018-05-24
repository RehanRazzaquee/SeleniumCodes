package myntraRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(features= {"src/main/java/myntraFeatureFile/MyntraFeature.feature"},glue= {"hooksPack","pages"},tags= {"@S.*"}, monochrome = true)
@CucumberOptions(features= {"src/main/java/myntraFeatureFile/MyntraFeature.feature"},glue= {"myntraHook","myntraPages"}, monochrome = true)
@RunWith(Cucumber.class)
public class Runner_Myntra {

}
