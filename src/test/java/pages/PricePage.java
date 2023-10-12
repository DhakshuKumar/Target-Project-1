package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import testBase.WebTestBase;
import utils.Utility;

public class PricePage extends WebTestBase {

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/input" )
	WebElement search_items;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/button")
	WebElement search_btn;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/main/div/div[1]/div/div[4]/div/div[1]/div[1]/div[2]/div[1]/button")
	WebElement filter;
	
	@FindBy(xpath="/html/body/div[17]/div/div/div[2]/div/button[5]")
	WebElement price_btn;
	
	
	public PricePage()
	{
		PageFactory.initElements(driver, this);
	}
	


	public void price() throws AWTException {
		// TODO Auto-generated method stub
		search_items.click();
		search_items.sendKeys("womens shoes");
		Utility.manualenter(driver);
		filter.click();
		price_btn.click();
		
SoftAssert softassert=new SoftAssert();
 		
 		softassert.assertEquals(driver.getTitle(),"Target : Expect More. Pay Less.");
 		softassert.assertAll();
		
	}

}
