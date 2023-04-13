package starter.main;

import net.thucydides.core.annotations.Step;

public class Account {

    @Step("I click my account correctly")
    public void iClickMyAccountCorrectly(){
        System.out.println("I click my account correctly");
    }

    @Step("I click settings & privacy options")
    public void iClickSettingsPrivacyOptions(){
        System.out.println("I click settings & privacy options");
    }

    @Step("I am on the settings page")
    public void iAmOnTheSettingsPage(){
        System.out.println("I am on the settings page");
    }
}
