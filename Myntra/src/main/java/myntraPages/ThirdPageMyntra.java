package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;


public class ThirdPageMyntra extends ProjectMethods {
	
	public ThirdPageMyntra() {
				PageFactory.initElements(driver, this);
		}
	
	@FindBy(how=How.XPATH,using = "//div[@class='amount red']/div ")
	private WebElement cartPrice;
	
	@When("Verify Product name with Stored Name")
	public ThirdPageMyntra cartPrice() {
		
		String r=getText(cartPrice);
		System.out.println(r);
		r=r.replace(",","");
		if(SecondPageMyntra.s.equals(r)) {
		System.out.println("Price is successfully Validated");
		}
		else 
		System.out.println("Price doesn't match");
		return this;
	}	
	
}
