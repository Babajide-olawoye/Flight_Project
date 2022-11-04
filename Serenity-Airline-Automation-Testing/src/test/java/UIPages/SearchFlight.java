package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:3000/")
public class SearchFlight extends PageObject{
	
	//Select the flight on the home page
	public void searchFlight() {
		$("#dpt").click(); //select departure drop down menu
		$("#svl").click(); //select Seville
		$("#dpr").click(); //select destination drop down menu
		$("//option[@value='Berlin']").click(); //select Berlin
		$("#input1").sendKeys("20-Nov-2022"); //input departure day
		$("#input2").sendKeys("25-Dec-2022"); //input return day
		$("#continue").click();
		
	}
	
	//Read the displayed date on the flight selection page
	public String correctValueDisplyed() {
		return $("#date").getText();
	}
	
	public String firstFlightDisplayedCorrectly() {
		return $("#Iberia").getText();
	}
	
	public String secondFlightDisplayedCorrectly() {
		return $("#Ryanair").getText();
	}
	
	public String thirdFlightDisplayedCorrectly() {
		return $("#Lufthansa").getText();
	}
	
	public void selectingFlight () {
		$("#Popover2").click();
		$("#btn-secondary").click();
		$("#btn-secondary").click();
		$("#cont").click();
		$("#yesBtn").click();
	}
	
	public String correctFinalPurchaseAmount() {
		return $("#sum").getText();
	}

}
