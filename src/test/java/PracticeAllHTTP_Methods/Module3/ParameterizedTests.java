package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;

public class ParameterizedTests {


    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]{
                {"sahil", "QA"},
                {"shaikh", "devops"},
                {"sahilshaikh", "senior QA"}
        };
    }

    @Test(dataProvider = "userData")
    public void createUserDataDriver(String name, String job) {
        RestAssured.baseURI = "https://reqres.in/api";

        // Send POST and extract response as String
//        String jsonResponse =
                given()

                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"name\": \"" + name + "\",\n" +
                        "  \"job\": \"" + job + "\"\n" +
                        "}")
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo(name))  // you can uncomment if you want validation
                .body("job", equalTo(job));
                //.extract()
                //.asString();   // ✅ Correct way to get response body as String
//.extract().response() (for full response object).
       // System.out.println("Response for " + name + ": " + jsonResponse);
    }
}
