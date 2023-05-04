package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    //======================== Locator ====================
    private By signInPage(){
        return By.xpath("//p[text()='Saat ini kamu masih Guest lho, masuk ke akun kamu yuk']");
    }

    private By signInBtn() {
        return By.id("button_signin_home");
    }
    private By emailField() {
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginBtn() {
        return By.id("submit_login");
    }
    private By homePage(){
        return By.id("product_type_0");
    }

    //======================== Functional ==================
    @Step
    public void userOnSignInPage() {
        open();
        $(signInPage()).shouldBeVisible();
    }
    @Step
    public void userClickLoginButton() {
        $(signInBtn()).click();
    }

    @Step
    public void userInputValidEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginBtn()).click();
    }
    @Step
    public void userOnHomePage(String pulsa){
        $(homePage()).type(pulsa);
    }
}
