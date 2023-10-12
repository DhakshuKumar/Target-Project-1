package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class ScrolldownPage extends WebTestBase {
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/input" )
	WebElement search_items;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/button")
	WebElement search_btn;
	
	public ScrolldownPage()
	{
		PageFactory.initElements(driver, this);
	}
public void scrolldown() throws AWTException, InterruptedException {
	search_items.click();
	search_items.sendKeys("womens shoes");
	Utility.manualenter(driver);
	Thread.sleep(2000);
	Utility.scrollingdown(driver, search_btn);
	Thread.sleep(2000);
	Utility.scrollingdown(driver, search_btn);
	Thread.sleep(2000);
	Utility.scrollingdown(driver, search_btn);
	Thread.sleep(2000);
	Utility.scrollingdown(driver, search_btn);
}
}
