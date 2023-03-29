package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Network;

public class NetworkSteps {
    @Steps
    Network network;
    @When("I click my network button")
    public void iClickMyNetworkButton() {
        network.iClickMyNetworkButton();
    }

    @And("I click connections")
    public void iClickConnections() {
        network.iClickConnections();
    }

    @Then("I am on the connections page")
    public void iAmOnTheConnectionsPage() {
        network.iAmOnTheConnectionsPage();
    }
}
