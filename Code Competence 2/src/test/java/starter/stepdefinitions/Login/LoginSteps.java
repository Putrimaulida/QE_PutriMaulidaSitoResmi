package starter.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Login.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;
    @Given("I set the api POST endpoint")
    public void iSetTheApiPOSTEndpoint() {
        login.iSetPOSTApiEndpoints();
    }

    @When("I send HTTP POST request")
    public void iSendHTTPPOSTRequest() {
        login.iSendGETHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200() {
        login.iReceiveValidHTTPResponseCode200();
    }

    @And("I received the token")
    public void iReceivedTheToken() {
        login.iReceivedTheToken();
    }

    //=================== INVALID LOGIN =========================

    @When("I send HTTP POST request with incorrect password")
    public void iSendHTTPPOSTRequestWithIncorrectPassword() {
        login.iSendHTTPPOSTRequestWithIncorrectPassword();
    }

    @Then("I receive valid HTTP response code 401")
    public void iReceiveValidHTTPResponseCode401() {
        login.iReceiveValidHTTPResponseCode401();
    }

    @And("I received error message {string}")
    public void iReceivedErrorMessage(String message) {
        login.iReceivedErrorMessage(message);
    }
}
