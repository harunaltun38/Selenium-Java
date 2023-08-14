package harunaltunhwe.tests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import harunaltunhwe.TestComponents.BaseTest;
import harunaltunhwe.TestComponents.Retry;
import harunaltunhwe.pageobjects.LandingPage;
import harunaltunhwe.pageobjects.ShopPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LandingPageTest extends BaseTest{
//falls mit failed Test rerun @Test(retryAnalyzer=Retry.class)
	
	@Test(retryAnalyzer=Retry.class)	
	public void landingPage() throws IOException {
     // Info: Wurde in die Klasse BaseTest ausgelagert
	//	WebDriverManager.chromedriver().setup();
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--remote-allow-origins=*");
	//	WebDriver driver = new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	driver.manage().window().maximize();
		
		
	//	LandingPage landingpage = new LandingPage(driver); 
	//	landingpage.goTo();
		
	//	LandingPage landingpage = launchApplication();    nicht mehr noetig, weil in BaseTest die Methode launchApplication() mit BeforeMethod annotiert wurde
		landingpage.enterCredentials("Harun","Harunaltun3233@hotmail.de" ,"1234");
		landingpage.enterPersonalData("check", "Female", "Student", "31.07.1992");
		landingpage.submit();
		landingpage.checkResponseMessage();  //Todo
		
		// ShopPage shoppage = new ShopPage(driver);
		// usw...
		
	}
	
	

}
