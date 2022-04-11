Feature: DOB Field Validation in BetFed User Registration Form

Background: 
Given I successfully load with the BetFed Registration Form
 
  Scenario Outline: Verify the DOB Field Validation Error Message when passing invalid format
    
    When the user enters invalid DOB format as "<DOBInvalidInput>"
    Then I verify Date Of Birthd Field Validation Error message 
    
    Examples: 
      | DOBInvalidInput  		|
      | 10-07-1987    			|     
      | 12/31/1987    			|
      |	12/311987						|
      | 1001/1987						|
      
      
  Scenario: Verify the DOB field is filled correctly when the passing valid input
    
 		When the user enters valid DOB format as "10/07/1987"
    Then I verify Date Of Birth Field Validation Error message 
    
          
  Scenario: Verify the DOB field does not accept less than 18 years old
    
 		When the user enters valid DOB format as "10/07/2015" but less than eighteen years old
    Then I verify Date Of Birth Field Validation Error message 