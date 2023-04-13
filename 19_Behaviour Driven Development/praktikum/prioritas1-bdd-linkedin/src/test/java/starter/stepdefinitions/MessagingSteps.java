package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Messaging;

public class MessagingSteps {
    @Steps
    Messaging messaging;
    @When("I click pen button")
    public void iClickPenButton() {
        messaging.iClickPenButton();
    }

    @And("I enter name or multiple names")
    public void iEnterNameOrMultipleNames() {
        messaging.iEnterNameOrMultipleNames();
    }

    @And("I write a message")
    public void iWriteAMessage() {
        messaging.iWriteAMessage();
    }

    @And("I click send button")
    public void iClickSendButton() {
        messaging.iClickSendButton();
    }

    @Then("I have successfully send the message")
    public void iHaveSuccessfullySendTheMessage() {
        messaging.iHaveSuccessfullySendTheMessage();
    }
}
