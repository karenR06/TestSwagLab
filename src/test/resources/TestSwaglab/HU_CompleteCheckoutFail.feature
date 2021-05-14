Feature: Complete Checkout

@checkout

 Scenario Outline: As an user, I need to checkout the products
 
 Given An user has to products on the cart
 
 	  When enter to the cart
      And click on checkout button
	  #The system ask your information
	  And click on Continue button
	  Then It is show an error message 
	  #Error: First Name is required