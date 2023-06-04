package starter.user.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class LoginPage {
    protected static String url ="https://fakestoreapi.com/";

    @Step("I set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "auth/login";
    }
    @Step("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = "{\n" +
                "                username: \"mor_2314\",\n" +
                "                password: \"83r5^_\"\n" +
                "            }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received the token")
    public void iReceivedTheToken(){
        restAssuredThat(response -> response.body("token", greaterThanOrEqualTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjIsInVzZXIiOiJtb3JfMjMxNCIsImlhdCI6MTY4NTg1Njk4MH0.IZhz-Kire6kxmPA7jZq5j7MqjxsoiqRrGrHbBuOVftY")));
    }

    //=================== INVALID LOGIN =========================

    @Step("I send HTTP POST request with incorrect password")
    public void iSendHTTPPOSTRequestWithIncorrectPassword() {
        String body = "{\n" +
                "                username: \"mor_2314\",\n" +
                "                password: \"123\"\n" +
                "            }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }

    @Step("I receive valid HTTP response code 401")
    public void iReceiveValidHTTPResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received error message {string}")
    public void iReceivedErrorMessage(String message) {
        restAssuredThat(response -> response.equals(message));
    }
}
