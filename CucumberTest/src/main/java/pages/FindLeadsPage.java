package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.SeMethods;

public class FindLeadsPage extends SeMethods {


	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using = "//label[text()='Lead ID:']/following::input[4]")
	private WebElement eleCompanyName;
	@And("Enter the company Name as (.*)")
	public FindLeadsPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using = "//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	@And("Click find Leads Button")
	public FindLeadsPage clickFindLeadsButton() {
		click(eleFindLeads);
		return this;
	}

	@FindBy(how=How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstResultant;
	public String getFirstResultantLeadID()  {
		return getText(eleFirstResultant);
	}
	@And("Click on the first Resultant Lead")
	public ViewLeadsPage clickFirstResultantLead()  {
		click(eleFirstResultant);
		return new ViewLeadsPage();
	}

	@FindBy(how=How.LINK_TEXT, using ="Phone")
	private WebElement elePhoneNumbersearch;
	public FindLeadsPage clickPhoneSearchOption() {
		click(elePhoneNumbersearch);
		return this;
	}

	@FindBy(how=How.NAME, using ="phoneAreaCode")
	private WebElement elePhoneAreaCode;
	public FindLeadsPage typePhoneAreaCode() {
		click(elePhoneAreaCode);
		return this;
	}

	@FindBy(how=How.NAME, using ="phoneNumber")
	private WebElement elePhoneNumber;
	public FindLeadsPage typePhoneNumber() {
		click(elePhoneNumber);
		return this;
	}

	@FindBy(how=How.XPATH, using ="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadID;
	@And("Enter the Lead ID as (.*)")
	public FindLeadsPage typeLeadID(String data) {
		type(eleLeadID,data);
		return this;
	}

	@FindBy(how=How.XPATH, using ="//div[@class='x-paging-info']")
	private WebElement eleErrMessage;
	@And("Verify Error Information")
	public String getErrorInfo() {
		return getText(eleErrMessage);
	}
	@Then("Show Error Information")
	public void showErrorInfo() {
		System.out.println(getErrorInfo());
	}

	@FindBy(how=How.LINK_TEXT, using ="Email")
	private WebElement eleEmaillinktext;
	public FindLeadsPage clickEmailField() {
		click(eleEmaillinktext);
		return this;
	} 

	@FindBy(how=How.NAME, using ="emailAddress")
	private WebElement eleEmailaddress;
	public FindLeadsPage typeEmailAddress(String data)  {
		type(eleEmailaddress,data);
		return this;
	}

	@FindBy(how=How.XPATH, using ="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleFirstnameresultantfield;
	public String getFirstResultantname()  {
		return getText(eleFirstnameresultantfield);
	}
	
	
}


