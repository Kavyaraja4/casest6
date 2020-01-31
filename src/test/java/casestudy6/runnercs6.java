package casestudy6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/stepdef6/casestudy6.feature",
	                  glue="casestudy6",
	                 // tags={"@login , @payment"},
	                   plugin={"html:target/htmlreport"})
	                  //,"junit:target/xmlreport.xml"})
	public class runnercs6 {
}
