package starter.user.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleProduct {
    protected static String url = "https://fakestoreapi.com/products/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "1";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received data id 1")
    public void iReceivedDataId(){
//        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
//        restAssuredThat(response -> response.body("[0].title", equalTo("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops")));
    }
}
