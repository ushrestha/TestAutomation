package kumar.maps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kumar.steps.HelloStep;
import net.thucydides.core.annotations.Steps;

public class HelloCucumberMap {
	
	@Steps HelloStep helloStep;
	
	@Given("I open google page")
	public void openGooglePage(){
         
		helloStep.openGooglePage();
	}
	@When("I search for term '(\\w+)'")
	public void searchForTerm(String fruit){
		helloStep.searchForTerm(fruit);
	}
	@Then("I should see link for '(\\w+)'")
		public void shouldSeeDefinitionOfApple(String fruit){
		helloStep.shouldSeeDefinitionOfApple(fruit);
		
	}

	
	}
