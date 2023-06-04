package starter.stepdefinitions.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Product.GetSingleProduct;

public class GetSingleProductSteps {
    @Steps
    GetSingleProduct getSingleProduct;
    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        getSingleProduct.iSetTheGETApiEndpoint();
    }

    @When("I send HTTP GET request")
    public void iSendHTTPGETRequest() {
        getSingleProduct.iSendHTTPGETRequest();
    }

    @And("I received data id 1")
    public void iReceivedDataId() {
        getSingleProduct.iReceivedDataId();
    }
}
