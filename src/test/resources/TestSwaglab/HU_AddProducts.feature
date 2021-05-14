Feature: Add Products

@addproducts

 Scenario Outline: As an user, I need to add any products to cart
 
 Given An user logged into the Swaglabs portal
 
 	  When Select a product and click on Add to cart
	  Then It is added the product on the cart
