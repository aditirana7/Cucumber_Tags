package Runner_class;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:\\Users\\Administrator\\Documents\\Aditi Rana\\Cucumber with selenium\\BDD_2\\src\\test\\java\\Feature_with_tags\\Tags_demo.feature" , 
				 glue = "StepDefinition", 
				 dryRun = true,
				 //tags="@smoke or @regression and @EndtoEnd"
				 //tags= "@regression"
				// tags= "@smoke"
				 //tags="(@smoke or @regression) and not @EndtoEnd"
				 //tags="@smoke or @regression"
				 tags="@smoke or not @regression"
                 )


public class runner_single {

}
