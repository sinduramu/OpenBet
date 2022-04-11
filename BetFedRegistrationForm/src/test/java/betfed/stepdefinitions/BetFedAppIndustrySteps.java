package betfed.stepdefinitions;

	import betfedimplementation.Industry;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class BetFedAppIndustrySteps {
		Industry indus = new Industry();

		@Given("the BedFed URL is successfully loaded")
		public void the_bed_fed_url_is_successfully_loaded() {
		    System.out.println("The BetFed URL is successfully loaded");
		}

		@When("the user clicks on Industry Drop down values")
		public void the_user_clicks_on_industry_drop_down_values() {
		    
		   
		}

		@Then("verify the actual Industry drop down values with the expected list as {string}")
		public void verify_the_actual_industry_drop_down_values_with_the_expected_list_as(String indusDropdown) {
		    
		   indus.IndustryDropDown(indusDropdown);
		}


}
