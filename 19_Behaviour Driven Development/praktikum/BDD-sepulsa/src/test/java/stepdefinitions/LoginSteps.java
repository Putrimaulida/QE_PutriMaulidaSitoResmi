package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        login.onTheLoginPage();
    }

    @When("I enter my email and password correctly")
    public void iEnterMyEmailAndPasswordCorrectly() {
        login.enterEmailAndPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() {
        login.onTheHomePage();
    }
}
