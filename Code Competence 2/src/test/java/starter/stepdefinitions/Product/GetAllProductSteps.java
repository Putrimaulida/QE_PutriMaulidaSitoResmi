package starter.stepdefinitions.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Product.GetAllProduct;

public class GetAllProductSteps {
    @Steps
    GetAllProduct getAllProduct;
    @Given("I set the api GET ALL endpoint")
    public void iSetTheApiGETALLEndpoint() {
        getAllProduct.iSetTheGETApiEndpoint();
    }

    @When("I send HTTP GET ALL request")
    public void iSendHTTPGETALLRequest() {
        getAllProduct.iSendHTTPGETRequest();
    }

    @And("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails() {
        getAllProduct.iReceivedTheDataForAllProducts();
    }
}
