package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class InvalidPost {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set the endpoint in the POST api")
    public String iSetTheEndpointInThePOSTApi(){
        return url + "posts/101";
    }
    @Step("I send invalid HTTP POST id request")
    public void iSendInvalidHTTPPOSTIdRequest(){
        String body = " {\n" +
                "     \"userId\": 1,\n" +
                "        \"id\": 101,\n" +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  }";

        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(iSetTheEndpointInThePOSTApi());
    }
    @Step("I receive a valid HTTP response code 404")
    public void iReceiveAValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I can't add new user")
    public void iCanTAddNewUser(){
    }
}
