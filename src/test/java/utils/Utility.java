package utils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testBase.WebTestBase;
public class Utility extends WebTestBase {
	
	public static void mouseOnHover(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void mouseOnClick(WebDriver driver, WebElement element,WebElement element1)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		element1.click();
	}
	public static void scrollingdown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(2,250)");
	}
	public static void manualenter(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
}


