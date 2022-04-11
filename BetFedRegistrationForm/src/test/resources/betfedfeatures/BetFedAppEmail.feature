Feature: Email Field Validation in BedFed User Registration Form

 
	Background:
		Given I successfully load with the BedFed Registration Form

  Scenario Outline: Verify the Email Field Validation Error Message
    
    When the user enters invalid input "<emailInvalidInput>"
    Then I verify Email Field Validation Error message 
    
    Examples: 
      | emailInvalidInput  		|
      | sindu 					|     
      | Sindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindusindus|
      |	Sindu@test 			|    
      |	Sindu123.test		|
      | Sindu@test@one	|
      |	sindu.test.one	|
      
      
      
  Scenario Outline: Verify the Email Address is filled correctly and must be unique
    
    When the user enters valid input as "<emailValidInput>"
    Then I verify Email Field is successfully filled
    
   		| emailValidInput  							|
      | sinduramu@gmail.com 					|     
      | sinduramu@yahoo.co.in					|
      |	sinduramu@xyz.com 						|    
      |	sinduramu87@test.com					|

    
    
  