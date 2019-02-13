package stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LogInPage;
import com.qa.util.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInPageSteps extends BasePage {
	HomePage homePage;
	
	LogInPage logInPage;

	@Given("^User opens Browser$")
	public void user_opens_Browser() throws Throwable {
		BasePage.initialization();
	}

	@Then("^User is already on Home page$")
	public void user_is_already_on_Home_page() throws Throwable {
		HomePage homePage = new HomePage();
		boolean homePageLogo = homePage.verifyHomePageLogo();
		Assert.assertTrue(homePageLogo);
	}

	@When("^title of Home page$")
	public void title_of_Home_page() throws Throwable {
		HomePage homePage = new HomePage();
		String homePageTitle = homePage.verifyHomeTitle();
		System.out.println("Home Page Title: "+homePageTitle);
		Assert.assertEquals(homePageTitle, "CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information");
	}

	
	@Then("^user logs into the app$")
	public void user_logs_into_the_app() throws Throwable {
		LogInPage logInPage = new LogInPage();
		logInPage.userLogIn("shuwaibliaquat@hotmail.com", "hhb12345");
		
	}

	@Then("^user is successfully logged in$")
	public void user_is_successfully_logged_in() throws Throwable {
		LogInPage logInPage = new LogInPage();
		String logInPagerTitle = driver.getTitle();
		System.out.println("LogInPage Title: "+logInPagerTitle);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	
	

@Given("^User opens the browser$")
public void user_opens_the_browser() throws Throwable {
	BasePage.initialization();
}

@When("^User is at the home page$")
public void user_is_at_the_home_page() throws Throwable {
	HomePage homePage = new HomePage();
	boolean homePageLogo = homePage.verifyHomePageLogo();
	Assert.assertTrue(homePageLogo);
}

@Then("^User click on Top panel signin link and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_click_on_Top_panel_signin_link_and_enters_and(String username, String password)throws Throwable {
	LogInPage logInPage = new LogInPage();
	logInPage.userTopPanelLogIn(username, password);
}
@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
	driver.quit();
}



@Given("^User opens cvs in browser$")
public void user_opens_cvs_in_browser() throws Throwable {
	BasePage.initialization();
}

@When("^title of  signin page$")
public void title_of_signin_page() throws Throwable {
	LogInPage logInPage = new LogInPage();
	String logInPagerTitle = driver.getTitle();
	System.out.println("LogInPage Title: "+logInPagerTitle);
}

@Then("^user click on signin link and user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String emailAddress, String pwd) throws Throwable {
	LogInPage logInPage = new LogInPage();
	logInPage.userLogIn(emailAddress, pwd);
}


@Then("^close the browser for this scenario$")
public void close_the_browser_for_this_scenario() throws Throwable {
	driver.quit();
}
}
