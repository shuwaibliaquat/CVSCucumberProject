package stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.util.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTagSteps extends BasePage{
	HomePage homepage;
	
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
		
		BasePage.initialization();
	}

	@After
	public void afterScenario() {
		driver.close();
		System.out.println("Testing Finished");
		System.out.println("This will run after the Scenario");
	}

	@Given("^user verifies homepage title$")
	public void user_verifies_homepage_title() {
		HomePage homepage = new HomePage();
		String homePagetitle = driver.getTitle();
		System.out.println(homePagetitle);

	}

	@Given("^clicked successfully on pharmacy link$")
	public void clicked_successfully_on_pharmacy_link() throws Exception {
		HomePage homepage = new HomePage();
		homepage.verifyPharmacyPageLink();
	}

	@Then("^clicked successfully on minute clinic link$")
	public void clicked_successfully_on_minute_clinic_link() throws Exception {
		HomePage homepage = new HomePage();
		Thread.sleep(2000);
		homepage.verifyMinuteClinicLink();
		driver.navigate().back();
	}

	@Given("^clicked successfully on shop link$")
	public void clicked_successfully_on_shop_link() throws Exception {
		HomePage homepage = new HomePage();
		Thread.sleep(2000);
		homepage.verifyShopLink();
		driver.navigate().back();
	}

	@Given("^clicked successfully on extracare link$")
	public void clicked_successfully_on_extracare_link() {
		HomePage homepage = new HomePage();
		homepage.verifyExtraCareLink();
	}

	@Given("^clicked successfully on contact lenses$")
	public void clicked_successfully_on_contact_lenses() {
		HomePage homepage = new HomePage();
		homepage.verifyContactLensesLink();
	}

	@Given("^clicked successfully on photo link$")
	public void clicked_successfully_on_photo_link() {
		HomePage homepage = new HomePage();
		homepage.verifyPhotoLink();
		driver.navigate().back();
	}

}
