package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInt;

public class LoginStep extends DriverInt {

    @Given("user enters a password as {string}")
    public void user_enters_a_password_as(String string) {

    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

    }

    @Then("Login should be successful")
    public void login_should_be_successful() {

    }

    @Then("Login should be unsuccessful")
    public void login_should_be_unsuccessful() {


    }
}
