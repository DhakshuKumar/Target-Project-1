package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class FilterPage extends WebTestBase {
	@FindBy(id = "ikea-search-input" )
	WebElement search_items;
	
	@FindBy(id = "search-box__searchbutton")
	WebElement search_btn;
	
	@FindBy(id= "onetrust-accept-btn-handler")
	WebElement cookies_btn;
	
	@FindBy(xpath="//span[text()='Sort']")
	WebElement category;
	
	

public FilterPage()
{
	PageFactory.initElements(driver, this);
}
public void filtering() {
	search_items.click();
	search_items.sendKeys("Air Frier");
	search_btn.click();
	cookies_btn.click();
	category.click();
	
}
}