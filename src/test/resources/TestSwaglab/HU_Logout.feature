Feature: Logout

@login

 Scenario Outline: As an user, I need to logout the portal
 
 Given An user logged into the Swaglabs portal
 
 	  When click on the menu
      And Select the Logout option
      And click on the Logout option
	  Then Close the Session 
      And Show the Login Screen