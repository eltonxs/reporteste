package web;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.web" }, features = {
		"src/main/resources/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" },tags="")

public class Runner {

}
