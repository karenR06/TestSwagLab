package com.test_swaglab.pageobject;

import org.openqa.selenium.WebElement;

import com.test_swaglab.challenge.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ErrorLogin {
	
	@When("Enter to incorrect username {string} and correct password {string}")
	public void enter_to_incorrect_username_and_correct_password(String user, String pass) {
		CommonUtils.logIn(user, pass);
		SeleniumUtils.waitAnimationElement();
	}
		
	@Then("The system shows an error message")
	public void the_system_shows_an_error_message() {
		SeleniumUtils.waitAnimationElement();
		@SuppressWarnings("unused")
		WebElement error = SeleniumUtils.waitElement("error-button", "class", 3);
	}


}
