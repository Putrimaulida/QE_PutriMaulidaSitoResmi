package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetId {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET id api endpoints")
    public String iSetGETIdApiEndpoints(){
        return url + "posts/1";
    }
    @Step("I send GET id HTTP request")
    public void iSendGETIdHTTPRequest(){
        SerenityRest.given().get(iSetGETIdApiEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for detail user")
    public void iReceiveValidDataForDetail(){
        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(1)));
    }
}
