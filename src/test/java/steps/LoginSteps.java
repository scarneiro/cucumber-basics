package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user navigates to Facebook website")
    public void user_navigates_to_facebook_website() {
        System.out.println("user navigates to Facebook website");
    }

    @When("user validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("user validates the homepage title");
    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println("user enters " + username + " username");
    }

    @And("user enters {string} password")
    public void user_enters_password(String password) {
        System.out.println("user enters " + password + " password");
    }

    @And("user clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        System.out.println("user clicks on the signin button");
    }

    @And("user validates captcha image")
    public void userValidatesCaptchaImage() {
    }
}
