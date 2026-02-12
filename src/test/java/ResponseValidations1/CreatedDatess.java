package ResponseValidations1;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class CreatedDatess {


    String response1 = "{ \"id\": 101, \"name\": \"Sahil Shaikh\", \"job\": \"Automation Tester\", \"createdAt\": \"2025-10-08T10:30:00Z\" }";
    String response2 = "{ \"id\": 102, \"name\": \"Aisha Khan\", \"job\": \"Software Engineer\", \"createdAt\": \"2025-10-08T10:31:00Z\" }";

    JsonPath js = new JsonPath(response1);
    JsonPath js2 = new JsonPath(response2);

    String date1 = js.getString("createdAt");
    String date2 = js2.getString("createdAt");

    Assert.assertTrue(date2.compareTo(date1)> 0, "second user created later than first");

    Assert.assertNotEquals(dat1,date2,"both the date are not requals" );
    Assert.assertTrue(date2.endsWith("Z"));
    Assert.assertTrue(date1.endsWith("Z"));
}
