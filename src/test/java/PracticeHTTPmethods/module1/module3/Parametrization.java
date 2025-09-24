package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Parametrization {
    @DataProvider(name ="userdata")
    public Object [] [] userdata(){
        return new Object[][]{{"sahil", "QA"},
                {"shaikh", "devOps"},
                {"sahilshaikh", "senior QA"}
        };

    }
    @Test(dataProvider = "userdata")
    public void createUser(String name, String job){

        RestAssured.baseURI ="";
        String response =given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "\"name\":\""+name+"\",\n" +
                        "\"job\" : \""+job+"\"\n" +
                        "\n" +
                        "}")
                .when().post("/user")
                .then().statusCode(200)
                .header("Content-Type",equalTo("application/json; charst=utf8"))
                .extract().asString();
        System.out.println(response);
    }
}
