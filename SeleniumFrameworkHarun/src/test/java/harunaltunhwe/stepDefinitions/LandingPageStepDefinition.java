package harunaltunhwe.stepDefinitions;

import java.io.IOException;

import harunaltunhwe.TestComponents.BaseTest;
import harunaltunhwe.pageobjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition extends BaseTest{
	public LandingPage landingPage;
	
	@Given("I landed on the Landing Page")
	public void I_landed_on_the_Landing_Page() throws IOException {
		
		this.landingPage = launchApplication();
	}
	
	@Given("^Filled in the credentials with name (.+) and password (.+) and email (.+)$")
	public void Filled_in_the_credentials_with_name_and_password_and_email(String name, String password, String email) {
		landingpage.enterCredentials(name, email ,password);
	}
	
	@When("^I check the checkbox (.+) and select the gender (.+) and check my Employment status (.+) enter my date of birth (.+)$")
	public void I_check_the_checkbox_and_select_the_gender_and_check_my_Employment_status_enter_my_date_of_birth(String check_status, String gender, String employment_status, String date_of_birth) {
		landingpage.enterPersonalData(check_status, gender, employment_status, date_of_birth);
	}
	
	@And("I click on Submit")
	public void I_click_on_Submit() {
		landingpage.submit();	
	}
	
	@Then("I will get {string} as confirmation message on the page")
	public void I_will_a_confirmation_message_on_the_page(String message) {
		landingpage.checkResponseMessage();
		driver.close();
	}
		
	
	

}
