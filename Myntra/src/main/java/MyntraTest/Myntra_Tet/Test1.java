package MyntraTest.Myntra_Tet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test
	public void myntraTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElementByXPath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input").sendKeys("Sunglasses",Keys.ENTER);
	driver.findElementByXPath("(//label[@class='common-customRadio vertical-filters-label'])[5]").click();
	
	Thread.sleep(2000);
	driver.findElementByXPath("//label[@style='background-color: rgb(94, 177, 96);']").click();
	System.out.println(driver.findElementsByXPath("//h4[contains(text(),'Unisex')]/following::span[4][contains(text(),'(40% OFF)')]").size());
	
	Thread.sleep(2000);

	driver.findElementByXPath("(//li[@class='product-base'][2])/a/img").click();
	String s=driver.findElementByXPath("//p[@class='pdp-selling-price']/strong").getText();
	System.out.println(s);
	driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']").click();
	
	String r=driver.findElementByXPath("//div[@class='amount red']/div ").getText();
	r=r.replace(",","");
	if(s.equals(r)) {
		System.out.println("Price is successfully Validated");
	}
	else
		System.out.println(r);
		

}
}