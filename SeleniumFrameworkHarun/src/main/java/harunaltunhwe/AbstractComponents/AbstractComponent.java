package harunaltunhwe.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// Parent Class to all Page Object classes
public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
	}
    // calling the wait methods in the Page Objects
	// static
	public void implicit_wait_in_Sec(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	// explicit wait:
	public void explicit_wait_until_ElementClickable(int sec, String elementByXPath) { // Warten auf ein bestimmtes
																						// Element + max WarteZeit

		// Initialize and wait till element(link) became clickable - timeout in 10
		// seconds
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(sec))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(elementByXPath)));
	}

	// explicit wait alternative:
	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	// fluent wait (explizit + frequently)

//	public void fluent_wait_until_ElementClickable_And_Frequency(int sec, int freq, String elementByXPath) {

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)) // maximum
//				.pollingEvery(Duration.ofSeconds(freq)) // frequently alle 5 seconds
//				.ignoring(NoSuchElementException.class);

//		WebElement element = wait.until(driver -> driver.findElement(By.xpath(elementByXPath)));
		
		
		
		// alternativ: WebElement element = wait.until(driver -> {
		// return driver.findElement(By.xpath(elementByXPath)); //});
//	}
	
	
	// add Javascriptexecutor
	
	
	///________________ andere Methoden aus altem Projekt:
	
	public void enterText(String xpath, String valueToEnter) {
        WebElement element = getFieldByXPATH(xpath);        
        element.clear();
        element.sendKeys(valueToEnter);
        element.sendKeys(Keys.TAB);
    }

    public WebElement clickElement(String xpath) {
        WebElement element = getFieldByXPATH(xpath);
        element.click();

        return element;
    }

    public void selectElement(WebElement element, String value) {

        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void CallWebPage(String page) {
        driver.get(page);
    }

    public WebElement getFieldById(String id) {
        WebElement element = driver.findElement(By.id(id));
        return element;
    }

    public WebElement getFieldByXPATH(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;
    }


}
