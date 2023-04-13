package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.UpdateProfile;

public class UpdateProfileSteps {
    @Steps
    UpdateProfile updateProfile;
    @When("I click my profile correctly")
    public void iClickMyProfileCorrectly() {
        updateProfile.iClickMyProfileCorrectly();
    }

    @And("I click pen icon options")
    public void iClickPenIconOptions() {
        updateProfile.iClickPenIconOptions();
    }

    @And("I am on the update profile page")
    public void iAmOnTheUpdateProfilePage() {
        updateProfile.iAmOnTheUpdateProfilePage();
    }

    @Then("I click save button")
    public void iClickSaveButton() {
        updateProfile.iClickSaveButton();
    }
}
