package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyntraHome extends ProjectMethods {

	public MyntraHome() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//*[@id='desktop-header-cnt']/div[2]/div[3]/input")
	private WebElement search;
	
	@Given("Enter the search value in search option")
	public MyntraHome searchSunglasses() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(search, "Sunglasses");
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='desktop-submit']/span")
	private WebElement searchButton;
	
	@When("Click the Myntra Search Button")
	public MyntraHome searchClick() {
		click(searchButton);
		return this;		
	}

	@FindBy(how=How.XPATH,using="(//label[@class='common-customRadio vertical-filters-label'])[5]")
	private WebElement sortPercentage;
	
	@And("Get the Count of sunglasses with 40% OFF")
	public MyntraHome percentage() {
		click(sortPercentage);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using = "//label[@style='background-color: rgb(94, 177, 96);']")
	private WebElement color;
	
	@And("Select Green Catogory")
	public MyntraHome choseColor() throws InterruptedException {
		Thread.sleep(3000);
		click(color);
		System.out.println(driver.findElementsByXPath("//h4[contains(text(),'Unisex')]/following::span[4][contains(text(),'(40% OFF)')]").size());
		return this;
	}
	@FindBy(how=How.XPATH,using = "(//li[@class='product-base'][2])")
	private WebElement secondItem;
	
	@And("Select the Second Resultant sunglass")
	public SecondPageMyntra second() {
		click(secondItem);
		return new SecondPageMyntra();
	}
	

}
