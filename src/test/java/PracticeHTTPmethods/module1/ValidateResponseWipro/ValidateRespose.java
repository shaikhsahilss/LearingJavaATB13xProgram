package PracticeHTTPmethods.module1.ValidateResponseWipro;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class ValidateRespose {
    @Test
    public void validateResponse(){

        JsonPath jsonPath = new JsonPath(payload.jsonResponse());

        System.out.println(jsonPath.getInt("responseCode"));

        int count = jsonPath.getInt("productList.size()");
int sum = 0;
        for(int i = 0; i < count; i++){
            int product = jsonPath.getInt("productList["+i+"].productNumber");
            sum = sum = product;

        }
        System.out.println(sum);
    }
}
