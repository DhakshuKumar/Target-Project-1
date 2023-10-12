package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase {
	@FindBy(id="username")
	WebElement mobile;
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="keepMeSignedIn")
	WebElement checkbox_btn;
	
	@FindBy(id="login")
	WebElement continue_btn;
	
	//@FindBy(xpath= "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/a")
	//WebElement skip_btn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public void Login_Click() {
	
		mobile.sendKeys(prop.getProperty("mobile"));
		password.sendKeys(prop.getProperty("password"));
		checkbox_btn.click();
		continue_btn.click();
		//skip_btn.click();

	}
}
	