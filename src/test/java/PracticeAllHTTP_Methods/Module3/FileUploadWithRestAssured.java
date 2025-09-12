package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;

public class FileUploadWithRestAssured {
    @Test
    public void uploadfile(){
        RestAssured.baseURI="";

        given()
                .multiPart("file",new File("xyz.txt"))
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("files.file", notNullValue());


    }
}
