package starter.pages;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the login page")
    public void onTheLoginPage(){
        System.out.println("I am on the login page");
    }
    @Step("I enter my email and password correctly")
    public void enterEmailAndPassword(){
        System.out.println("I enter my email and password correctly");
    }
    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("I click login button");
    }
    @Step("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }
}
