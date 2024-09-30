package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ASUS\\Desktop\\Suresh_Automation\\Framework\\src\\main\\java\\cucumber\\Login.feature",
		glue= {"stepDefinitions"}
		
		)
public class testRunner {

}
