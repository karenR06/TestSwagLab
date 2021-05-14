Feature: Thank you page

@thankyoupage

 Scenario Outline: As an user, I need to finish the buy
 
 Given An user has been checkout
 
 	  When click on Finish button
      Then It is a show a Thank you message
	  #THANK YOU FOR YOUR ORDER
