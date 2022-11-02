package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:3000/")
public class SearchFlight extends PageObject{
	
	//Select the flight on the home page
	public void searchFlight() {
		$("#dpt").click();
		$("#svl").click();
		$("#dst").click();
		$("#vln1").click();
		$("#input1").sendKeys("20-Nov-2022");
		$("#input2").sendKeys("25-Dec-2022");
		$("#continue").click();
		
	}
	
	//Read the displayed date on the flight selection page
	public String correctValueDisplyed() {
		return $("#date").getText();
	}

}
