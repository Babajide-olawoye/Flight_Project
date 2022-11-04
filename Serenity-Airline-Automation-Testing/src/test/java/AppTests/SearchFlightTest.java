package AppTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.FlightSelectionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SearchFlightTest {
	
	@Steps
	FlightSelectionSteps flightSelectionSteps; 
	
	@Managed(driver = "chrome")
	WebDriver browser;
	
	@Test
	public void flightSearchTest() {
		flightSelectionSteps.isOnHomePage();
		flightSelectionSteps.selectFlight();
		flightSelectionSteps.correctDateVisible();
		flightSelectionSteps.correctCompaniesAreDisplayed();
		flightSelectionSteps.pickFlight();;
		flightSelectionSteps.correctFullAmountDisplayed();
	}
	
	
	
}
