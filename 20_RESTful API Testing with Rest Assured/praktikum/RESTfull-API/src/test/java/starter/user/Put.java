package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Put {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set PUT api endpoints")
    public String iSetPUTApiEndpoints(){
        return url + "posts/1";
    }
    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest(){
        String body = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"perubahan setelah dilakukannya PUT\",\n" +
                "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(iSetPUTApiEndpoints());
    }
    @Step("I receive valid data for updated user")
    public void iReceiveValidDataForUpdatedUser(){
        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("title", equalTo("perubahan setelah dilakukannya PUT")));
        restAssuredThat(response -> response.body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        )));
    }
}
