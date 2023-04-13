package starter.stepdefinisions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SelectProduct;

public class SelectProductSteps {
    @Steps
    SelectProduct selectProduct;
    @When("I click product pulse button")
    public void iClickProductPulseButton() {
        selectProduct.iClickProductPulseButton();
    }

    @And("I enter my phone number")
    public void iEnterMyPhoneNumber() {
        selectProduct.iEnterMyPhoneNumber();
    }

    @And("I choose nominal pulse")
    public void iChooseNominalPulse() {
        selectProduct.iChooseNominalPulse();
    }

    @Then("I am on the payment page")
    public void iAmOnThePaymentPage() {
        selectProduct.iAmOnThePaymentPage();
    }
}
