package PracticeAllHTTP_Methods.ValidateJsonReposneWipro;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.io.File;

public class Validatejson {
    @Test
    public void jsonValidate(){
        File jsonFile = new File("C:\\Users\\Sahil\\IdeaProjects\\ATB13RestAAUred\\src\\test\\java\\PracticeAllHTTP_Methods\\payLoad.json");
        JsonPath js = new JsonPath(jsonFile);
        System.out.println(js.getInt("responseCode"));
        System.out.println(js.getString("responseText"));
        System.out.println(js.getList("productList").get(0));


        int count = js.getInt("productList.size()");
        int sum = 0;
        for(int i = 0 ; i < count; i++){

            int produnumber = js.getInt("productList["+i+"].productNumber");
            sum = sum+ produnumber;
        }
        System.out.println(sum);
    }
}
