package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumberreports.json"}, 
        features = "src/test/resources/features/calculator.feature"
      
)
public class CucumberTestSuite {}