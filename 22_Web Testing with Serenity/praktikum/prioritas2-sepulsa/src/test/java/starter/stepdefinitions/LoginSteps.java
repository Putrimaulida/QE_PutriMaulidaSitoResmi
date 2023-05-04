package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;

    @Given("user on sign in page")
    public void userOnSignInPage() {
        login.userOnSignInPage();
    }
    @When("user click login button")
    public void userClickLoginButton() {
        login.userClickLoginButton();
    }
    @And("user input valid email")
    public void userInputValidEmail() {
        login.userInputValidEmail("putrimaulida368@gmail.com");
    }
    @And("user input valid password")
    public void userInputValidPassword() {
        login.inputPassword("maulida25");
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        login.clickLoginButton();
    }

    @Then("user on home page")
    public void userOnHomePage(String pulsa) {
        login.userOnHomePage(pulsa);
    }
}
