Feature: Login

@login

 Scenario Outline: As an user, i need to login in SWAGLABS
 
 Given Enter to URL 
 #https://www.saucedemo.com/
 
 	  When An user enter the username "<user>" and password "<pass>"
      #It show the available products 
	  And clic on login button
	  Then The system enter to Products screem
	  
	  
#ExamplesLine
|user		  			|pass		 		 |
|standard_user	|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user		|secret_sauce|