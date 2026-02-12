package practiceHTTPmethod.module3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Parametrizations {

    @DataProvider(name = "logindata")
    public Object [] [] logintest(){
        return new Object[][] {{"sahil", "QA"},
                {"shaikh", "devOps"},
                {"sahilshaikh", "senior QA"}
        };
    }
    @Test(dataProvider = "logindata")
    public void testMethod(String name, String job){

        RestAssured.baseURI="";

        String resonse = given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "\"name\":\""+name+"\",\n" +
                        "\"job\" : \""+job+"\"\n" +
                        "\n" +
                        "}")
                .when().post("/user")
                .then().statusCode(201)
                .header("Content-Type",equalTo("application/json;chartset=utf8"))
                .extract().asString();
        //System.out.println(resonse);
//String date1 = resonse.jsonPath().getString("username");
    }
//.extract().asString() → just the body as a string
//
//.extract().response() → full response object with body, headers, status code, etc.
}
