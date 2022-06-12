package steps;

import com.thoughtworks.gauge.Step;
import configs.ConfigReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.*;


public class ApiStepImplementation {

    String apiUrl = ConfigReader.getApiUrl("api_url");
    Response response;
    JsonPath jsonPath;

    @Step("<key> endpointine istek atılır.")
    public void itShouldReturnResponseByGivenEndpoint(String key) {
        response = given().get(apiUrl + key);
        response.prettyPrint();
    }

    @Step("Status code <code> olduğu kontrol edilir.")
    public void itShouldReturnExpectedStatusCode(int code) {
        Assert.assertEquals(code, response.statusCode());
    }

    @Step("Urun adının <key> olduğu kontrol edilir.")
    public void itShouldCheckTheName(String key) {
        jsonPath = response.jsonPath();
        String name = jsonPath.getString("data[0].name");
        Assert.assertEquals(key, name);
    }

    @Step("<endPoint> endpoint bir body ile istek atılır.")
    public void itShouldAddNewProduct(String endPoint) {
        String requestBody = "{\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"grapes\",\n" +
                "    \"price\": 5,\n" +
                "    \"stock\": 50\n" +
                "}";
        response = given().body(requestBody).post(apiUrl + endPoint);
        response.prettyPrint();

    }

    @Step("<key> mesajı kontrol edilir.")
    public void itShouldCheckTheMessage(String key) {
        jsonPath = response.jsonPath();
        String message = jsonPath.getString("Message");
        Assert.assertEquals(key, message);
    }

}
