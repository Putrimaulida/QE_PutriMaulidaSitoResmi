package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set DELETE api endpoints")
    public String iSetDELETEApiEndpoints(){
        return url + "posts/1";
    }
    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetDELETEApiEndpoints());
    }
    @Step("I receive valid HTTP response code 204")
    public void iReceiveValidHTTPResponseCode204(){
        restAssuredThat(response -> response.statusCode(204));
    }
}
