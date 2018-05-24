package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class SecondPageMyntra extends ProjectMethods {
static String s;
	
	public SecondPageMyntra() {
				PageFactory.initElements(driver, this);
		}
	
	@FindBy(how=How.XPATH,using = "//p[@class='pdp-selling-price']/strong")
	private WebElement price1;
	
	@And("Store the Product Price") 
	public SecondPageMyntra fetchPrice1() {
		s=getText(price1);
		System.out.println(s);
		return this;
	}	
	@FindBy(how=How.XPATH,using = "//span[text()='ADD TO BAG']")
	private WebElement addToBag;
	
	@And("Click on Add to Bags Button")
	public SecondPageMyntra addToBag() {
		click(addToBag);
		return this;
		}
	@FindBy(how=How.XPATH,using = "//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
	private WebElement openBag;
	
	@And("Click on Go to Bags Button")
	public ThirdPageMyntra openBag() throws InterruptedException {
		Thread.sleep(3000);
		click(openBag);
		return new ThirdPageMyntra();
		}
}
