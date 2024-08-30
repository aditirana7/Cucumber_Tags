package Runner_class;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:\\Users\\Administrator\\Documents\\Aditi Rana\\Cucumber with selenium\\BDD_2\\src\\main\\resources\\feature_background\\Background.feature" , 
				 glue = "Steps_definition_background", 
				 dryRun = true,
				 plugin = {"pretty", 
						   "html:test-output",
						   "json:target/cucumber.json",
		  				   "junit:junit_xml/cucumber.xml" }
         
               )


public class Test_runner_with_background {

}
