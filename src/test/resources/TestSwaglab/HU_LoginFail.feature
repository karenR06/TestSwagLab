Feature: Error Login

@login

 Scenario Outline: As an user, i need to login in SWAGLABS
 
 Given Enter to URL 
 #https://www.saucedemo.com/
 
 	When Enter to incorrect username "<user>" and correct password "<pass>"
	And clic on Login button
      Then The system shows an error message
      #Epic sadface: Username and password do not match any user in this service

 #ExamplesLine
|user			|pass		 		 |
|standard	|secret_sauce|