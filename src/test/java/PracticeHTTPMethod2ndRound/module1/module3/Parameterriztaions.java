package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class Parameterriztaions {
    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][]{
                {"sahil","Qa"},
                {"shaikh","Qa"}

        };


        }
    @Test(dataProvider = "loginData")
    public void logintest(String user , String jobs){
        RestAssured.baseURI="";
        String payload ="{\n" +
                "\"name\":\""+user+"\",\n" +
                "\"job\":\""+jobs+"\"\n" +
                "}";

        String response = given().header("Content-Type","application/json")
                .body(payload)
                .when().post("/user")
                .then().statusCode(201)
                .extract().asString();
        System.out.println(response);
    }

}

