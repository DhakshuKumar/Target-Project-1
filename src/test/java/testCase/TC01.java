package testCase;
import java.awt.AWTException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AddToCartPage;
import pages.DeliveryPage;
import pages.FavouritesPage;
import pages.LoginPage;
import pages.PricePage;
import pages.RegisteryPage;
import pages.ScrolldownPage;
import pages.SearchPage;
import pages.SelectStorePage;
import pages.SigninPage;
import testBase.WebTestBase;
public class TC01 extends WebTestBase {
	LoginPage loginpage;
	SigninPage signinpage;
	SearchPage searchpage;
	AddToCartPage addtocartpage;
	SelectStorePage selectstorepage;
	FavouritesPage favouritespage;
	RegisteryPage registerypage;
	ScrolldownPage scrolldownpage;
	DeliveryPage deliverypage;
	PricePage pricepage;
	public TC01() {
		super();
	}
	@BeforeMethod
	public void BeforeMethod() {
		
		loadUrl();
		loginpage=new LoginPage();	
		signinpage=new SigninPage();
		searchpage=new SearchPage();
		addtocartpage=new AddToCartPage();
		selectstorepage=new SelectStorePage();
		favouritespage=new FavouritesPage();
		registerypage=new RegisteryPage();
		scrolldownpage = new ScrolldownPage();
		deliverypage = new DeliveryPage();
		pricepage= new PricePage();
		
		
		
	}
	@Test(priority=0)
	public void verifyLogin() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		signinpage.signIn_click();
		Thread.sleep(2000);
		loginpage.Login_Click();

	
	}
	@Test
	public void search() throws AWTException {
		SoftAssert softassert=new SoftAssert();
		searchpage.searching();
		softassert.assertAll();
	}
	
	
	@Test
	public void cart() throws AWTException {
		SoftAssert softassert=new SoftAssert();
		addtocartpage.cart_btn();
		softassert.assertAll();
	}
	
	@Test
	public void menu_btn() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		signinpage.signIn_click();
		Thread.sleep(2000);
		loginpage.Login_Click();
		Thread.sleep(2000);
		selectstorepage.selectstore();
		softassert.assertAll();
	}
	
	@Test
	public void favo_btn() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		signinpage.signIn_click();
		Thread.sleep(2000);
		loginpage.Login_Click();
		Thread.sleep(2000);
		favouritespage.favourites();
		softassert.assertAll();
		
	}
	
	@Test
	public void registery_btn() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		signinpage.signIn_click();
		Thread.sleep(2000);
		loginpage.Login_Click();
		Thread.sleep(2000);
		registerypage.registery();
		softassert.assertAll();
		
	}
	@Test
	public void Scrolldown() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		scrolldownpage.scrolldown();
		softassert.assertAll();
	
	
}
	@Test
	public void Delivery() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		deliverypage.delivery();
		softassert.assertAll();
	}
	
	
	@Test
	public void Filter() throws InterruptedException, AWTException {
		SoftAssert softassert=new SoftAssert();
		pricepage.price();
		softassert.assertAll();
	}
	
}
