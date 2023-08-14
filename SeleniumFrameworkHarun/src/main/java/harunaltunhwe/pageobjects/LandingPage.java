package harunaltunhwe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.Assert;

import harunaltunhwe.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{

	WebDriver driver;

	public LandingPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement name=
	// driver.findElement(By.xpath("(//*[contains(@name,\"name\")])[1]"));

	// better in PageFactory
	@FindBy(xpath = "(//*[contains(@name,\"name\")])[1]")
	WebElement name;

	@FindBy(xpath = "//*[contains(@name,\"email\")]")
	WebElement emailElem;

	@FindBy(xpath = "//*[contains(@id,\"exampleInputPassword1\")]")
	WebElement passwordElem;

	@FindBy(xpath = "//*[contains(@id,\"exampleCheck1\")]")
	WebElement checkboxElem;

	@FindBy(id = "exampleFormControlSelect1")
	WebElement genderElem;

	@FindBy(xpath = "//*[contains(@id,\"inlineRadio2\")]")
	WebElement radiobuttonEmployed;

	@FindBy(xpath = "//*[contains(@id,\"inlineRadio1\")]")
	WebElement radiobuttonStudent;

	@FindBy(xpath = "//*[contains(@type,\"date\")]")
	WebElement dateElem;

	@FindBy(xpath = "//*[contains(@type,\"submit\")]")
	WebElement SubmitElem;

	// @FindBy(xpath="blabla") also possible if you get more than one element
	// List<WebElement>elements;

	public void enterCredentials(String username, String email, String password) {
		name.sendKeys(username);
		emailElem.sendKeys(email);
		passwordElem.sendKeys(password);
	}

	public void enterPersonalData(String checkbox, String gender, String radiobutton, String date) {

		if (checkbox.equals("check")) {
			if (!checkboxElem.isSelected()) {
				checkboxElem.click();
			}
		}

		Select dropdown = new Select(genderElem);
		dropdown.selectByVisibleText(gender);

		if (radiobutton.equals("Student")) {
			radiobuttonStudent.click();
		}
		if (radiobutton.equals("Employed")) {
			radiobuttonEmployed.click();
		}
		

		dateElem.sendKeys(date);
	}

	public void submit() {
		SubmitElem.click();
	}

	public void checkResponseMessage() {
		// Todo
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}

}
