package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    // ====  Positive Login  ====
    @Given("user on login page")
    public void userOnLoginPage() {
        loginPage.onLoginPage();
    }
    @When("user input valid username")
    public void userInputValidUsername() {
        loginPage.inputUserName("standard_user");
    }
    @And("user input valid password")
    public void userInputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }
    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }
    @Then("user on products page")
    public void userOnProductsPage() {
        loginPage.userOnProductPage();
    }

    // ==== Negative Login  ====
    @Then("user input invalid username")
    public void userInputInvalidUsername() {
        loginPage.inputUserName("putri");
    }
    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        loginPage.userSeeErrorMessage();
        loginPage.validateEqualErrorMessage(message);

    }

    // ==== Positive All Item ====
    @And("user click add to cart button in one product")
    public void userClickAddToCartButtonInOneProduct() {
        loginPage.clickAddToCartButtonOneProduct();
    }

    @Then("user can see the number of products in the cart symbol")
    public void userCanSeeTheNumberOfProductsInTheCartSymbol() {
        loginPage.userCanSeeTheNumberOfProductsInTheCartSymbol();
    }

    // ==== Negative All Item ====
    @And("user click remove button")
    public void userClickRemoveButton() {
        loginPage.userClickRemoveButton();
    }

    @Then("user can not see the number of products in the cart symbol")
    public void userCanNotSeeTheNumberOfProductsInTheCartSymbol() {
        loginPage.userCanNotSeeTheNumberOfProductsInTheCartSymbol();
    }

    // ==== Positive Overview Checkout
    @And("user click the shopping cart")
    public void userClickTheShoppingCart() {
        loginPage.userClickTheShoppingCart();
    }

    @And("user to the checkout page")
    public void userToTheCheckoutPage() {
        loginPage.userToTheCheckoutPage();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        loginPage.userClickCheckoutButton();
    }

    @And("user to the personal data information page")
    public void userToThePersonalDataInformationPage() {
        loginPage.userToThePersonalDataInformationPage();
    }

    @And("user fill first name field")
    public void userFillFirstNameField() {
        loginPage.userFillFirstNameField("putri");
    }

    @And("user fill last name field")
    public void userFillLastNameField() {
        loginPage.userFillLastNameField("maulida");
    }

    @And("user fill postal code field")
    public void userFillPostalCodeField() {
        loginPage.userFillPostalCodeField("68483");
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        loginPage.userClickContinueButton();
    }

    @And("user on the overview checkout page")
    public void userOnTheOverviewCheckoutPage() {
        loginPage.userOnTheOverviewCheckoutPage();
    }

    @And("user get the price total")
    public void userGetThePriceTotal() {
        loginPage.userGetThePriceTotal();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        loginPage.userClickFinishButton();
    }

    @Then("user successfully checkout in one {string}")
    public void userSuccessfullyCheckoutInOne(String success) {
        loginPage.userSuccessfullyCheckoutInOne(success);
    }

    // ==== Negative Overview Checkout ====
    @Then("user get an error message {string}")
    public void userGetAnErrorMessage(String errorLastName) {
        loginPage.userGetAnErrorMessage(errorLastName);
    }
}
