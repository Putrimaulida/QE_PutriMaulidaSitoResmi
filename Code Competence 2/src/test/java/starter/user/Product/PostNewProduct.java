package starter.user.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class PostNewProduct {
    protected static String url ="https://fakestoreapi.com/";

    @Step("I set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "products";
    }
    @Step("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = "{\n" +
                "    \"title\": \"test product\",\n" +
                "    \"price\": 13.5,\n" +
                "    \"description\": \"lorem ipsum set\",\n" +
                "    \"image\": \"https://i.pravatar.cc\",\n" +
                "    \"category\": \"electronic\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received new data")
    public void iReceivedNewData(){
        restAssuredThat(response -> response.body("title", equalTo("test product")));
        restAssuredThat(response -> response.body("price", equalTo( 13.5)));
        restAssuredThat(response -> response.body("description", equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("image", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("category", equalTo("electronic")));
    }
}
