package kumar.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HelloPage extends PageObject {
	@FindBy(css="input#lst-ib")
	WebElementFacade searchBox;
	
	
	public void searchforTerm(String fruit) {
		searchBox.typeAndEnter(fruit);
		
	}

	public boolean reportLinkVisible(String fruit) {
		if(isElementVisible(By.linkText(fruit)))
		return true;
		else
			return false;
	}
	

}
