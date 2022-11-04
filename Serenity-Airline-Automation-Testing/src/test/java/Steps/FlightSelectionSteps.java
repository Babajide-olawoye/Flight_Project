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
		Assert.assertTrue(searchFlight.correctValueDisplyed().contains("20-Nov-2022"));
	}
	
	@Step
	public void correctCompaniesAreDisplayed(){
		Assert.assertTrue(searchFlight.firstFlightDisplayedCorrectly().equals("Iberia"));
		Assert.assertTrue(searchFlight.secondFlightDisplayedCorrectly().equals("Ryanair"));
		Assert.assertTrue(searchFlight.thirdFlightDisplayedCorrectly().equals("Lufthansa"));
	}
	
	@Step
	public void pickFlight() {
		searchFlight.selectingFlight();
	}
	
	@Step
	public void correctFullAmountDisplayed() {
		Assert.assertTrue(searchFlight.correctFinalPurchaseAmount().contains("238"));
	}
	
}


