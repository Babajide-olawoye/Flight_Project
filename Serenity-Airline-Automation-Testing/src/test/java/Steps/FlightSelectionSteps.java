package Steps;

import org.junit.Assert;

import UIPages.SearchFlight;
import net.thucydides.core.annotations.Step;

public class FlightSelectionSteps {
	
	private SearchFlight searchFlight;
	
	@Step
	public void isOnHomePage() {
		searchFlight.open();
	}
	
	@Step
	public void selectFlight() {
		searchFlight.searchFlight();
	}
	
	@Step
	public void correctDateVisible() {
		Assert.assertTrue(searchFlight.correctValueDisplyed().equals("Date 20-Nov-2022"));
	}
	
	
}


