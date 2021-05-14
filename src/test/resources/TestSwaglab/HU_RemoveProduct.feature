Feature: Remove Products

@removeproducts

 Scenario Outline: As an user, I need to remove products to cart
 
 Given An user logged in
 And contain products on the cart
 
 	  When click on the cart
      And Select a product
	  And click on Revome button
	  Then It is delete the product on the cart
