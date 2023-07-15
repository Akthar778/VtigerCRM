package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class troubleTicket extends BaseClass {
	// trouble ticket >>
	@Test
	public void trobleTicket() {

//		TroubleTicketPom ttp = new TroubleTicketPom(driver);
//		ttp.getTroubleTicketHeading().click();
//		
		trobuleticketpom.getTroubleTicketHeading().click();

		// click the plus icon
		trobuleticketpom.getTroubleTicketPlusIcon().click();

		// enter data into titile
		trobuleticketpom.getTitile().sendKeys("aktharr");

		// select prirority dropdown
		web.handlingDropDown(null, null);

	}

}
