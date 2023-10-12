package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class SelectStorePage extends WebTestBase{
	@FindBy(id="web-store-id-msg-btn")
	WebElement select_btn;
	
	@FindBy(id="zip-or-city-state")
	WebElement zip;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div[1]/div/div[1]/div[2]/button")
	WebElement lookup;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[3]/button")
	WebElement shop;

	public SelectStorePage()
	{
		PageFactory.initElements(driver, this);
	}

	public void selectstore() throws AWTException, InterruptedException {
	select_btn.click();
	Thread.sleep(2000);
	zip.sendKeys("90011");
	Thread.sleep(2000);
	lookup.click();
	Utility.manualenter(driver);
	Thread.sleep(2000);
	shop.click();
		
	}
	
	
}


