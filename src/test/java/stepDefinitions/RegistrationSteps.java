package stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;
import com.qa.util.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends BasePage{
	
	HomePage homePage;
	//RegistrationPage registrationPage;
	RegistrationPage registrationPage;
	
	@Given("^User is already on Home page for registration$")
	public void user_is_already_on_Home_page() throws Throwable{
		BasePage.initialization();
	}
	
	@When("^user is already on homepage$")
	public void user_is_already_on_homepage() throws Throwable {
		HomePage homePage = new HomePage();
		String homePageTitle = homePage.verifyHomeTitle();
		System.out.println("Home Page Title: "+homePageTitle);
		Assert.assertEquals(homePageTitle, "CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information");
	}

	@Then("^user clicks on create an account link for registration and verifies title of the registration page$")
	public void user_clicks_on_create_an_account_link_for_registration() throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		Thread.sleep(2000);
		String registrationPageTitle = registrationPage.clickRegistrationLinkAndVerifyRegPageTitle();
		System.out.println(registrationPageTitle);
		//Assert.assertEquals("Registration Optimization", registrationPageTitle);
	}

	@Then("^user enters in first step of registration \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_in_first_step_of_registration(String firstName, String lastName, String emailAddress, String password, String confirmPassword, String name) throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.registrationForm(firstName, lastName, emailAddress, password, confirmPassword);
		registrationPage.securityQustionAnswer(name);
		Thread.sleep(2000);
	
	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.clickContinue();
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_2nd_steps(String streetAddress, String city, String State, String zipCode, String phoneNumber, String Month, String Day, String Year) throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.registrationForm2ndPart(streetAddress, city, State, zipCode, phoneNumber, Month, Day,Year);

	}

	@Then("^user select gender from drop down menu$")
	public void user_select_gender_from_drop_down_menu() throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.regGenderDropDown();
	}

	@Then("^user click create account button to complete registration$")
	public void user_click_create_account_button_to_complete_registration() throws Throwable {
		RegistrationPage registrationPage = new RegistrationPage();
		//registrationPage.clickCreateAccount();
	}

	@Then("^close the registration browser$")
	public void close_the_registration_browser() throws Throwable {
		driver.quit();
	}


}
