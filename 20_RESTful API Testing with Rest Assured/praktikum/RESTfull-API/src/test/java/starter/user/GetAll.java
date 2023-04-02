package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAll {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set the api GET ALL endpoint")
    public String iSetTheApiSGetAllEndpoint(){
        return url + "posts";
    }
    @Step("I send a HTTP GET request")
    public void iSendAHttpGetRequest(){
        SerenityRest.given().get(iSetTheApiSGetAllEndpoint());
    }
    @Step("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails(){
        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
    }
}
