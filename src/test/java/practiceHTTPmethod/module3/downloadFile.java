package practiceHTTPmethod.module3;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
public class downloadFile {
    @Test
    public void downloadFile() throws FileNotFoundException {
        RestAssured.baseURI="";

       Response response=  given().when().get("smapole.text")
                .then().statusCode(200)
                .extract().response();
       byte[] filebytes = response.asByteArray();
        FileInputStream fos = new FileInputStream(new File(""));
//        fos.write(filebytes);
//        fos.close();
        System.out.println("file downlaod succfully");

    }
}
