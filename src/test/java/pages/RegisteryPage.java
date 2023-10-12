package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class RegisteryPage extends WebTestBase{
	
	 @FindBy(id="utilityNav-registries")
	WebElement reg;
	 
	 @FindBy(xpath="//a[@class='styles__StyledLink-sc-vpsldm-0 eqjfDm h-margin-p-default']")
	 WebElement pricematch;
	
	
	
	public RegisteryPage()
	{
		PageFactory.initElements(driver, this);
	}
public void registery() throws AWTException, InterruptedException {
	reg.click();
	pricematch.click();

}
}
