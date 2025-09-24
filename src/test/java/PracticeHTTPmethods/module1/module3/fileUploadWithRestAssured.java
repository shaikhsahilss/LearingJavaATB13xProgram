package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class fileUploadWithRestAssured {
    @Test
    public void uploadfile(){
        RestAssured.baseURI ="";

        given()
                .multiPart("file",new File("xyz.text"))

                .when()
                .post("/psot")
                .then()
                .statusCode(200)
                .body("files.file", notNullValue());
    }
}
