package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MyHomePage extends SeMethods{
	
	public MyHomePage() {
				PageFactory.initElements(driver, this);
		}
	
	@FindBy(how=How.LINK_TEXT,using = "Leads")
	private WebElement eleLeads;
	@And("Click on Leads link")
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage();
	}	
}
