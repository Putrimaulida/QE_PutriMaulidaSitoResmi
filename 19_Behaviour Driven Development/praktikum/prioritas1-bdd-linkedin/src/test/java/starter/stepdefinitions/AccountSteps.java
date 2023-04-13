package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Account;

public class AccountSteps {
    @Steps
    Account account;
    @When("I click my account correctly")
    public void iClickMyAccountCorrectly() {
        account.iClickMyAccountCorrectly();
    }

    @And("I click settings & privacy options")
    public void iClickSettingsPrivacyOptions() {
        account.iClickSettingsPrivacyOptions();
    }

    @Then("I am on the settings page")
    public void iAmOnTheSettingsPage() {
        account.iAmOnTheSettingsPage();
    }
}
