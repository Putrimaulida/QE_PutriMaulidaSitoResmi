package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject{
    private By createOne() {
        return AppiumBy.id("textViewLinkRegister");
    }
    private By nameFiled() {
        return AppiumBy.id("textInputEditTextName");
    }
    private By emailFiled() {
        return AppiumBy.id("textInputEditTextEmail");
    }
    private By passwordField() {
        return AppiumBy.id("textInputEditTextPassword");
    }
    private By confirmPassword() {
        return AppiumBy.id("textInputEditTextConfirmPassword");
    }
    private By registerButton() {
        return AppiumBy.id("appCompatButtonRegister");
    }
    private By successMessage() {
        return AppiumBy.id("snackbar_text");
    }


    //===========================================================


    @Step
    public void clickCreateOne() {
        onClick(createOne());
    }
    @Step
    public void inputName(String name) {
        onType(nameFiled(), name);
    }
    @Step
    public void inputEmail(String email) {
        onType(emailFiled(), email);
    }

    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }
    @Step
    public void inputConfirmPassword(String confirm) {
        onType(confirmPassword(), confirm);
    }
    @Step
    public void clickRegister() {
        onClick(registerButton());
    }
    @Step
    public String successRegisterMessage() {
        return waitUntilVisible(successMessage()).getText();
    }
}
