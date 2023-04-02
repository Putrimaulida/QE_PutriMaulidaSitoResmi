package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class InvalidGetAll {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set the GET ALL api endpoint")
    public String iSetTheApiSGETAllEndpoint(){
        return url + "posts";
    }
    @Step("I send a HTTP GET ALL request")
    public void iSendAHTTPGETAllRequest(){
        SerenityRest.given().get(iSetTheApiSGETAllEndpoint());
    }

    @Step("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails(){
        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
    }
}
