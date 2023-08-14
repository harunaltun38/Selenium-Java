package harunaltunhwe.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import harunaltunhwe.AbstractComponents.AbstractComponent;

public class ShopPage extends AbstractComponent{

	WebDriver driver;

	public ShopPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

// Object Repository and own Methods like LandingPage
// Call instance from this class in Test class (zB. LandingPageTest)