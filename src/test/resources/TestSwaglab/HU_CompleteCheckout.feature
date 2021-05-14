Feature: Complete Checkout

@checkout

 Scenario Outline: As an user, I need to checkout the products
 
 Given An user has to products on the cart
 
 	  When enter to the cart
      And click on checkout button
	  #The system ask your information
	  And Enter to First Name
	  And Enter to Last Name
	  And Enter to Zip/Postal Code
	  And click on Continue button
	  Then It is a show the overvie