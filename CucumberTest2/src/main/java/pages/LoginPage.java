package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class LoginPage extends SeMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	@Given("Enter the username as DemoSalesManager")
	public LoginPage enterUserName() {
		type(eleUserName, "DemoSalesManager");
		return this;
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	@And("Enter the Password as crmsfa")
	public LoginPage enterPassword() {
		type(elePassword, "crmsfa");
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	@When("Click on Login Button")
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();		
	}
	
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
