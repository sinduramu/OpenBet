Feature: Industry Drop down validation

Scenario Outline: Verify the Industry Drop down values
  	Given the BedFed URL is successfully loaded
    When the user clicks on Industry Drop down values
    Then verify the actual Industry drop down values with the expected list as "<dropDownList>"
    
	Examples:
	    
    	|	dropDownList							|
      | Agriculture 							|     
      | IT												|
      |	Education									|    
      |	Healthcare								|
      |	Unemployed								|
      |	Retired										|
      |	Other											|
      