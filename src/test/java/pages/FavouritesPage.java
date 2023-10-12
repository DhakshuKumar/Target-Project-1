package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class FavouritesPage extends WebTestBase {
	
	@FindBy(xpath="//span[text()='Hi, ']")
	WebElement HiDhakshu;
	
	@FindBy(id="listaccountNav-targetCrushLink")
	WebElement fav;
	
public FavouritesPage()
{
	PageFactory.initElements(driver, this);
}


public void favourites() throws AWTException {
	// TODO Auto-generated method stub
	HiDhakshu.click();
	fav.click();
	//share.click();
	//checkbox_btn.click();
	//copy_btn.click();
}
}
