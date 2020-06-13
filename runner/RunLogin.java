package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features/Login.feature",
							"src/test/java/features/CreateLead.feature",
							"src/test/java/features/EditLead.feature"},
				 glue="steps",
				 monochrome=true,
				 //tags= {"@smoke"}
				 //tags= {"@regression,@smoke"}
				 //tags={"@sanity","regression"},
				 //tags= {"~@smoke"},
				 //plugin= {"html:reports"}
				 plugin={"json:reports.json"})
				 //plugin= {"pretty","html:reports"})
				 
public class RunLogin extends AbstractTestNGCucumberTests{

}
