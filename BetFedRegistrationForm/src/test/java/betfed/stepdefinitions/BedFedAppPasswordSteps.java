package betfed.stepdefinitions;

import betfedimplementation.Password;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BedFedAppPasswordSteps {

	
Password passOne=new Password();
	
	@Given("I successfully load with the BedFed Registration Form")
	public void i_successfully_load_with_the_bed_fed_registration_form() {
	   System.out.println("The BetFed URL is successfully loaded");
	}

	@When("the user enters invalid input {string}")
	public void the_user_enters_invalid_input(String pass) {
		passOne.passwordValidation(pass);
		
	
	}

	@Then("I verify Email Field Validation Error message")
	public void i_verify_email_field_validation_error_message() {
		System.out.println("The entered password is not correct. Please correct the password based on the conditions");
	}
	
	@When("the user enters valid input {string}")
	public void the_user_enters_valid_input(String pass) {
		passOne.passwordValidation(pass);
	}

	@Then("I verify Password is filled correctly")
	public void i_verify_password_is_filled_correctly() {
	   System.out.println("Password is Filled correctly. Please proceed with the other fields");
	}
}
