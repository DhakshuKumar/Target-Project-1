package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class SigninPage extends WebTestBase {
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/nav/a[4]")
	WebElement find_signin;
	@FindBy(xpath= "/html/body/div[9]/div/div/div[2]/ul/li[1]/a")
	WebElement login;
	public SigninPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signIn_click() {
		find_signin.click();
		login.click();
	}

}
