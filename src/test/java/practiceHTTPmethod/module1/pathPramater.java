package practiceHTTPmethod.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class pathPramater {

    @Test
    public void pathParameter(){
       RestAssured.baseURI ="";
       given()
               .pathParams("id",2)
               .when()
               .get("/user/{id}")
               .then().statusCode(200)
               .body("name.first" , equalTo("sahil"));

    }
}
