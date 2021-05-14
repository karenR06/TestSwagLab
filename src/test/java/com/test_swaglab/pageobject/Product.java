package com.test_swaglab.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import com.test_swaglab.challenge.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product {

	@When("Select a product and click on Add to cart")
	public void select_a_product_and_click_on_Add_to_cart() {
		WebElement product = SeleniumUtils.waitElement("item_4_title_link", "id", 1);
		WebElement btnAdd = SeleniumUtils.waitElement("add-to-cart-sauce-labs-backpack", "id", 1);
		btnAdd.click();
	}
	
	@Then("It is added the product on the cart")
	public void it_is_added_the_product_on_the_cart() {
		WebElement cart = SeleniumUtils.waitElement("shopping_cart_badge", "class", 1);
		if(!cart.equals("1")) {
			
			assertTrue("No se encontró el mensaje Exitoso", SeleniumUtils.seEncuentra("[class='glyphicon glyphicon-ok-sign']", "css", 3));
		}
		
	    throw new io.cucumber.java.PendingException();
	}
}
