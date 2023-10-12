package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import testBase.WebTestBase;
import utils.Utility;

public class DeliveryPage extends WebTestBase{

	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/nav/div[5]/a")
	WebElement pickup;
	
		public DeliveryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void delivery() throws InterruptedException, AWTException {
		pickup.click();
		//pickonstore.click();
		Utility.manualenter(driver);
		
SoftAssert softassert=new SoftAssert();
 		
 		softassert.assertEquals(driver.getTitle(),"Target : Expect More. Pay Less.");
 		softassert.assertAll();
	}
}
