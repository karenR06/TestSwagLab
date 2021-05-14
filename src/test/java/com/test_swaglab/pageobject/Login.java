package com.test_swaglab.pageobject;

import org.openqa.selenium.WebElement;
import com.test_swaglab.challenge.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	
	@When("An user enter the username {string} and password {string}")
	public void an_user_enter_the_username_and_password(String user, String pass) {
		CommonUtils.logIn(user, pass);
		SeleniumUtils.waitAnimationElement();	

	}
		
	@Then("The system enter to Products screen")
	public void the_system_enter_to_products_scree() {
		SeleniumUtils.waitAnimationElement();
		@SuppressWarnings("unused")
		WebElement product = SeleniumUtils.waitElement("app_logo", "class", 3);
	}

}
