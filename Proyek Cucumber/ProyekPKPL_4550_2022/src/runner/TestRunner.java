package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@Cucumber.Options(features="Features")//Folder menyimpan feature file
@CucumberOptions(features="Features", glue="stepDefinition")
public class TestRunner {

}
