package PracticeAllHTTP_Methods.Module3;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;

class userdata{
    public static Data data;

    public static class Data{
        public static int id;
        public String email;
        public static String first_name;
        public String last_name;

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email=email;
        }

    }
}


public class Extracting_Response_Pojo {

     @Test
    public void extractResponseTopojo(){
         RestAssured.baseURI="";

         given()
                 .when().get("/user/2")

                 .then()
                 .statusCode(200)
                 .extract().as(userdata.class);
         System.out.println("userID :"+ userdata.Data.id);
         System.out.println(userdata.Data.first_name);
     }
}
