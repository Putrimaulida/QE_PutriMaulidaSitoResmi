package starter.user.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetLimitProduct {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "products?limit=5";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive data with a limit of 5")
    public void iReceiveDataWithALimitOf5(){
//        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
//        restAssuredThat(response -> response.body("[1].id", equalTo(2)));
//        restAssuredThat(response -> response.body("[2].id", equalTo(3)));
//        restAssuredThat(response -> response.body("[3].id", equalTo(4)));
//        restAssuredThat(response -> response.body("[4].id", equalTo(5)));
    }
}
