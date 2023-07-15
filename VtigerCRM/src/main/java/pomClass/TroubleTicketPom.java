package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketPom {

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSeveritiesDropDown() {
		return severitiesDropDown;
	}

	public WebElement getPrirorityDropDown() {
		return prirorityDropDown;
	}

	public WebElement getTitile() {
		return titile;
	}

	public WebElement getTroubleTicket() {
		return troubleTicket;
	}

	public WebElement getTroubleTicketPlusIcon() {
		return troubleTicketPlusIcon;
	}

	public WebElement getTroubleTicketHeading() {
		return troubleTicket;
	}

	public TroubleTicketPom(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Trouble Tickets']")
	private WebElement troubleTicket;

	@FindBy(xpath = "//img[@title='Create Ticket...']")
	private WebElement troubleTicketPlusIcon;

	@FindBy(xpath = "//textarea[@name='ticket_title']")
	private WebElement titile;

	@FindBy(xpath = "//select[@name='ticketpriorities']")
	private WebElement prirorityDropDown;

	@FindBy(xpath = "//select[@name='ticketseverities']")
	private WebElement severitiesDropDown;

	@FindBy(xpath = "//input[contains(@class,'crmButton small save')]")
	private WebElement saveButton;
}
