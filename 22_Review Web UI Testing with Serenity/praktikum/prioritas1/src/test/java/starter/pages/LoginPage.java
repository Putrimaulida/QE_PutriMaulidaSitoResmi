package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    //======================== Locator ====================
    private By usernameField() {
        return By.id("user-name");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By loginBtn() {
        return By.id("login-button");
    }
    private By titleProduct() {
        return By.xpath("//span[text()='Products']");
    }
    private By errorMessage() {
        return By.xpath("//h3[@data-test='error']");
    }
    private By addToCart() {
        return By.xpath("//button[text()='Add to cart']");
    }
    private By removeBtn() {
        return By.xpath("//button[text()='Remove']");
    }
    private By shoppingChat() {
        return By.xpath("//span[text()=1]");
    }
    private By titleCheckout() {
        return By.xpath("//span[text()='Your Cart']");
    }
    private By checkoutBtn() {
        return By.xpath("//button[text()='Checkout']");
    }
    private By personalInfo() {
        return By.xpath("//span[text()='Checkout: Your Information']");
    }
    private By firstnameField() {
        return By.id("first-name");
    }
    private By lastnameField() {
        return By.id("last-name");
    }
    private By postalCodeField() {
        return By.id("postal-code");
    }
    private By continueBtn() {
        return By.id("continue");
    }
    private By overviewInfo() {
        return By.xpath("//span[text()='Checkout: Overview']");
    }
    private By priceTotal() {
        return By.xpath("//div[text()='Total: $']");
    }
    private By finishBtn() {
        return By.id("finish");
    }
    private By completeInfo() {
        return By.xpath("//h2[text()='Thank you for your order!']");
    }
    private By errorLastName(){
        return By.xpath("//h3[@data-test='error']");
    }

    //======================== Functional ==================

    //==== Positive Login ====
    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }
    @Step
    public boolean userOnProductPage() {
        return $(titleProduct()).isDisplayed();
    }
    @Step
    public void inputUserName(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton() {
        $(loginBtn()).click();
    }

    // ==== Negative Login ====
    @Step
    public boolean userSeeErrorMessage() {
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

    // ==== Positive All Item ====
    @Step
    public void clickAddToCartButtonOneProduct() {
        $(addToCart()).click();
    }
    @Step
    public void userCanSeeTheNumberOfProductsInTheCartSymbol() {
        $(titleProduct()).isDisplayed();
    }

    // ==== Negative All Item ====
    @Step
    public void userClickRemoveButton() {
        $(removeBtn()).click();
    }
    @Step
    public void userCanNotSeeTheNumberOfProductsInTheCartSymbol() {
        $(titleProduct()).isDisplayed();
    }

    // ==== Positive Overview Checkout =====
    @Step
    public void userClickTheShoppingCart() {
        $(shoppingChat()).click();
    }

    @Step
    public void userToTheCheckoutPage() {
        $(titleCheckout()).isDisplayed();
    }

    @Step
    public void userClickCheckoutButton() {
        $(checkoutBtn()).click();
    }

    @Step
    public void userToThePersonalDataInformationPage() {
        $(personalInfo()).isDisplayed();
    }

    @Step
    public void userFillFirstNameField(String firstName) {
        $(firstnameField()).type(firstName);
    }

    @Step
    public void userFillLastNameField(String lastName) {
        $(lastnameField()).type(lastName);
    }

    @Step
    public void userFillPostalCodeField(String postalCode) {
        $(postalCodeField()).type(postalCode);
    }

    @Step
    public void userClickContinueButton() {
        $(continueBtn()).click();
    }

    @Step
    public void userOnTheOverviewCheckoutPage() {
        $(overviewInfo()).isDisplayed();
    }

    @Step
    public void userGetThePriceTotal() {
        $(priceTotal()).isDisplayed();
    }

    @Step
    public void userClickFinishButton() {
        $(finishBtn()).click();
    }

    @Step
    public void userSuccessfullyCheckoutInOne(String success) {
        $(completeInfo()).getText().equalsIgnoreCase(success);
    }

    // ==== Negative Overview Checkout
    @Step
    public void userGetAnErrorMessage(String errorLastName) {
        $(errorLastName()).getText().equalsIgnoreCase(errorLastName);
    }

}
