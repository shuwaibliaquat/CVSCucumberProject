package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BasePage;


public class LogInPage extends BasePage{
	static Logger log = Logger.getLogger(LogInPage.class);

	/*@cacheLookup-> Instead of looking into browser DOM every time it will create
	a cache memory in eclipse and will look up from there instead of browser DOM.
*/
	@FindBy(xpath = "//button[@id='signInBtn']")
	@CacheLookup
	WebElement topPanelsignInLink;

	@FindBy(xpath = "//input[@id='clubLoginEmail']")
	@CacheLookup
	WebElement emailAddressPopUpTextBox;

	@FindBy(xpath = "//input[@id='clubLoginPwd']")
	@CacheLookup
	WebElement passwordPopUpTextBox;
	
	@FindBy(css = "[form]")
	@CacheLookup
	WebElement signInBtn;



	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public String userLogIn(String emailAddress, String pwd) throws Exception {
		topPanelsignInLink.click();
		Thread.sleep(2000);
		emailAddressPopUpTextBox.sendKeys(emailAddress);
		passwordPopUpTextBox.sendKeys(pwd);
		signInBtn.click();
		return driver.getTitle();
	}

	public void userTopPanelLogIn(String popUpemailAddress, String popUpPwd) throws Exception {
		topPanelsignInLink.click();
		Thread.sleep(2000);
		emailAddressPopUpTextBox.sendKeys(popUpemailAddress);
		passwordPopUpTextBox.sendKeys(popUpPwd);
		signInBtn.click();
	}

}
