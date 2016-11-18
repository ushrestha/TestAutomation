package kumar.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

import kumar.pages.HelloPage;

public class HelloStep extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5219391485297961392L;
	HelloPage helloPage;

	@Step
	public void openGooglePage() {
	   helloPage.open();
		
		
		
	}

	public void searchForTerm(String fruit) {
		helloPage.searchforTerm(fruit);
		
	}

	public void shouldSeeDefinitionOfApple(String fruit) {
		assertThat(helloPage.reportLinkVisible(fruit)).isTrue();
		
	}

	

}
