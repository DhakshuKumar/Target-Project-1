package pages;
import java.awt.AWTException;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class SearchPage extends WebTestBase {
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/input" )
	WebElement search_items;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/button")
	WebElement search_btn;
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searching() throws AWTException
	{
		search_items.click();
		search_items.sendKeys("womens shoes");
		Utility.manualenter(driver);
		
SoftAssert softassert=new SoftAssert();
 		
 		softassert.assertEquals(driver.getTitle(),"Target : Expect More. Pay Less.");
 		softassert.assertAll();
	}
}