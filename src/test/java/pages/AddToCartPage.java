package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class AddToCartPage extends WebTestBase {

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/input" )
	WebElement search_items;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/div[6]/form/button")
	WebElement search_btn;
	
	@FindBy(xpath= "/html/body/div[1]/div[2]/main/div/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div/div/li[6]/a/div/div[1]")
	WebElement cart;
	//img
	@FindBy(id= "addToCartButtonOrTextIdFor88228660")
	WebElement cart_add;
	
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cart_btn() throws AWTException
	{
		search_items.click();
		search_items.sendKeys("Bags");
		Utility.manualenter(driver);
		cart.click();
		cart_add.click();
		Utility.manualenter(driver);
		
		
	
	}

	

}
