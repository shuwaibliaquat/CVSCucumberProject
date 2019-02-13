package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.BasePage;

public class HomePage extends BasePage{
	

		static Logger log = Logger.getLogger(HomePage.class);

		// Page Object Repository

		@FindBy(linkText = "CVS pharmacy™ homepage")
		WebElement homePageLogo; //CVS HomePage logo

		@FindBy(css = ".main-nav li:nth-of-type(1) [target]")
		WebElement pharmacyLink; //Pharmacy Link Tab

		@FindBy(css = ".main-nav li:nth-of-type(2) [target]")
		WebElement minuteClinicLink; //minuteClinicLink Link Tab

		@FindBy(css = ".main-nav li:nth-of-type(3) [target]")
		WebElement shopLink; //shopLink Link Tab

		@FindBy(css = ".main-nav li:nth-of-type(4) [target]")
		WebElement extraCareLink; //extraCareLink Link Tab

		@FindBy(css = ".main-nav li:nth-of-type(5) [target]")
		WebElement contactLensesLink; //contactLensesLink Link Tab

		@FindBy(css = ".main-nav li:nth-of-type(6) [target]")
		WebElement photoLink; //photoLink Link Tab

		@FindBy(xpath = "//input[@id='searchbox']")
		WebElement searchBox; //searchBox for searching in cvs.com
		
		@FindBy(xpath = "//input[@id='search']")
		WebElement storeLocatorSearchBox; //SearchBox to locate store in store locator page

		@FindBy(css = "#mobile-off__base")
		WebElement searchBoxBtn; //button to click item from search box
		
		// Initializing the page object using constructor 
		public HomePage() {
			PageFactory.initElements(driver, this);
		}

		// Action


		public String verifyHomeTitle() {
			return driver.getTitle();
		}

		public boolean verifyHomePageLogo() {
			return homePageLogo.isDisplayed();
		}

		public void verifySearchBox(String searchItem) {
			searchBox.sendKeys(searchItem);
			searchBoxBtn.click();
		}

		public String verifyPharmacyPageLink() {
			pharmacyLink.click();
			return driver.getTitle();
		
		}

		public void verifyMinuteClinicLink() {
			minuteClinicLink.click();
			
		}

		public void verifyShopLink() {
			shopLink.click();
			
		}

		public void verifyExtraCareLink() {
			extraCareLink.click();
			
		}

		public void verifyContactLensesLink() {
			contactLensesLink.click();
			
		}

		public void verifyPhotoLink() {
			photoLink.click();
			
		}

	
}
