package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.LoginScreen;
import starter.screen.RegisterScreen;

public class UserSteps {
    @Steps
    LoginScreen login;
    @Given("user on login page")
    public void userOnLoginPage() {
        login.onLoginPage();
    }
    @When("user input valid username")
    public void userInputValidUsername() {
        login.inputEmail("maulida55@gmail.com");
    }
    @And("user input valid password")
    public void userInputValidPassword() {
        login.inputPassword("maulida55");
    }
    @And("user click login button")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }
    @Then("user on the accounts page")
    public void userOnTheAccountsPage() {
        login.userOnTheAccountsPage();
    }

    // Negative Login
    @And("user input invalid password")
    public void userInputInvalidPassword() {
        login.inputPassword("maulida54");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        Assert.assertEquals(message, login.getErrorMessage());
    }

    // register
    @Steps
    RegisterScreen register;

    @When("user click create one")
    public void userClickCreateOne() {
        register.clickCreateOne();
    }

    @And("user input name")
    public void userInputName() {
        register.inputName("maulida");
    }

    @And("user input valid email")
    public void userInputValidEmail() {
        register.inputEmail("maulida55@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        register.inputPassword("maulida55");
    }

    @And("user input confirm password")
    public void userInputConfirmPassword() {
        register.inputConfirmPassword("maulida55");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        register.clickRegister();
    }

    @Then("user see message {string}")
    public void userSeeMessage(String success) {
        Assert.assertEquals(success, register.successRegisterMessage());
    }
}
