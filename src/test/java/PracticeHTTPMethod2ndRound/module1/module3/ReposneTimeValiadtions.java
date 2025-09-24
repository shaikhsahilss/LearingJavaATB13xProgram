package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ReposneTimeValiadtions {
    @Test
    public void resposneTime(){
        RestAssured.baseURI="";
        given()
                .when()
                .get()
                .then().time(lessThan(2000L)); //
    }
}
