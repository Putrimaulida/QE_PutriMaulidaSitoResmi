package starter.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set POST api endpoints")
    public String iSetPOSTApiEndpoints(){
        return url + "posts";
    }
    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest(){
        String body = " {\n" +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I receive valid HTTP response code 201")
    public void iReceive1ValidHTTPResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid data for new user")
    public void iReceiveValidDataForNewUser(){
        restAssuredThat(response -> response.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")));
        restAssuredThat(response -> response.body("id", equalTo(101)));
    }
}
