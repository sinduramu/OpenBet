Feature: Password Field Validation in BedFed User Registration Form
 
Background: 
Given I successfully load with the BedFed Registration Form


  Scenario Outline: Verify the Password Field Validation Error Message when passing invalid input
  
    When the user enters invalid input "<invalidInput>"
    Then I verify Email Field Validation Error message 
    
	Examples:
	    
    	|	invalidInput							|
      | test123 									|     
      | testonetesttwo123456789		|
      |	test#123									|    
      |	tes*123										|
      |	Welcomeone								|
      |	1234567890								|
      
      
 
  Scenario Outline: Verify the Password Field is filled correctly when passing valid input
  
    When the user enters valid input "<passwordValidInput>"
    Then I verify Password is filled correctly
    
    Examples: 
    
      | passwordValidInput  						|
      |	testtwo2												|	
      |	testonetwothreefour4						|						
      | test@1234 											|     
      | test!1234												|
      |	test@one!123										|  
      |	test@two!one!123@45							|  
    
   
      
    
      
  