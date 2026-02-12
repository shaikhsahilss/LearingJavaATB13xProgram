package practiceHTTPmethod.module3;
import io.restassured.RestAssured;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class uploadThefile {
    @Test
    public void uploadFile(){
        RestAssured.baseURI="";
        given()
                .multiPart("file" , new File(""))
                .when()
                .post("/post")
                .then().statusCode(200)
                .body("files.file", notNullValue());
    }

}
