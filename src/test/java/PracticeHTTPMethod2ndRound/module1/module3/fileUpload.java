package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class fileUpload {
    @Test
    public void fileupload(){
        RestAssured.baseURI="";
        given().multiPart("file",new File("xyz.txt"))
                .when().get()
                .then().statusCode(200)
                .assertThat()
                .body("file.file",notNullValue());
    }
}
