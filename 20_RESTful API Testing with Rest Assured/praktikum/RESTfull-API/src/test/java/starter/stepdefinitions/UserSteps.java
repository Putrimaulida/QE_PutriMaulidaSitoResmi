package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    GetAll getall;

    @Steps
    Post post;

    @Steps
    GetId getId;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Steps
    InvalidGetAll invalidGetAll;

    @Steps
    InvalidPost invalidPost;

    @Steps
    InvalidPut invalidPut;

    @Given("I set the api GET ALL endpoint")
    public void iSetTheApiGetAllEndpoint() {
        getall.iSetTheApiSGetAllEndpoint();
    }

    @When("I send a HTTP GET ALL request")
    public void iSendAHttpGetAllRequest() {
        getall.iSendAHttpGetRequest();
    }

    @Then("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHttpResponseCode200() {
        getall.iReceiveValidTheHttpResponseCode200();
    }

    @And("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails() {
        getall.iReceiveAnyDataForAllUsersDetails();
    }

    @Given("I set POST api endpoints")
    public void iSetPOSTApiEndpoints() {
        post.iSetPOSTApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.iSendPOSTHTTPRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode201() {
        post.iReceive1ValidHTTPResponseCode201();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        post.iReceiveValidDataForNewUser();
    }

    @Given("I set GET id api endpoints")
    public void iSetGETIdApiEndpoints() {
        getId.iSetGETIdApiEndpoints();
    }

    @When("I send GET id HTTP request")
    public void iSendGETIdHTTPRequest() {
        getId.iSendGETIdHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200() {
        getId.iReceiveValidHTTPResponseCode200();
    }

    @And("I receive valid data for detail user")
    public void iReceiveValidDataForDetailUser() {
        getId.iReceiveValidDataForDetail();
    }

    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        put.iSetPUTApiEndpoints();
    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        put.iSendPUTHTTPRequest();
    }

    @And("I receive valid data for updated user")
    public void iReceiveValidDataForUpdatedUser() {
        put.iReceiveValidDataForUpdatedUser();
    }

    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delete.iSetDELETEApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delete.iSendDELETEHTTPRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void iReceiveValidHTTPResponseCode204() {
        delete.iReceiveValidHTTPResponseCode204();
    }

    @Given("I set the GET ALL api endpoint")
    public void iSetTheGETAllApiEndpoint() {
        invalidGetAll.iSetTheApiSGETAllEndpoint();
    }

    @When("I send HTTP GET ALL request")
    public void iSendHTTPGETAllRequest() {
        invalidGetAll.iSendAHTTPGETAllRequest();
    }

    @And("I don't receive any data for user details")
    public void iDonTReceiveAnyDataForUserDetails() {
        invalidGetAll.iReceiveAnyDataForAllUsersDetails();
    }

    @Given("I set the endpoint in the POST api")
    public void iSetTheEndpointInThePOSTApi() {
        invalidPost.iSetTheEndpointInThePOSTApi();
    }

    @When("I send invalid HTTP POST id request")
    public void iSendInvalidHTTPPOSTIdRequest() {
        invalidPost.iSendInvalidHTTPPOSTIdRequest();
    }

    @Then("I receive a valid HTTP response code 404")
    public void iReceiveAValidHTTPResponseCode404() {
        invalidPost.iReceiveAValidHTTPResponseCode404();
    }

    @And("I can't add new user")
    public void iCanTAddNewUser() {
        invalidPost.iCanTAddNewUser();
    }

    @Given("I set the endpoint in the PUT api")
    public void iSetTheEndpointInThePUTApi() {
        invalidPut.iSetTheEndpointInThePUTApi();
    }

    @When("I send invalid HTTP PUT id request")
    public void iSendInvalidHTTPPUTIdRequest() {
        invalidPut.iSendInvalidHTTPPUTIdRequest();
    }

    @Then("I received HTTP response code 500")
    public void iReceivedAHTTPResponseCode500() {
        invalidPut.iReceivedResponseCode500();
    }

    @And("I am not receiving valid data for updated user")
    public void iAmNotReceivingValidDataForUpdatedUser() {
        invalidPut.iMNotReceivingValidDataForUpdatedUser();
    }
}
