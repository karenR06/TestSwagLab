package com.test_swaglab.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.test_swaglab.challenge.utils.Configuration;
import com.test_swaglab.challenge.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonUtils {
	String user;
	String pass;

	public CommonUtils() {
		// TODO Auto-generated constructor stub
	}


	@Given("Enter to URL")
	public void enter_to_url(String string) {
		Configuration.startConfiguration();
		PageFactory.initElements(Configuration.driver, this);
	}
	
	public static void logIn(String user, String pass) {
		WebElement userName = SeleniumUtils.waitElement("//*[@id=\"user-name\"]", "xpath", 1);
		WebElement password = SeleniumUtils.waitElement("password", "id", 1);
		userName.sendKeys(user);
		password.sendKeys(pass);
	}

	@When("clic on login button")
	public void clic_on_login_button() {
		WebElement btnLogin = SeleniumUtils.waitElement("login-button", "id", 1);
		btnLogin.click();
	}

	@Given("An user logged into the Swaglabs portal")
	public void an_user_logged_into_the_swaglabs_portal() {
		CommonUtils.logIn(user, pass);
		SeleniumUtils.waitAnimationElement();

	}
}

