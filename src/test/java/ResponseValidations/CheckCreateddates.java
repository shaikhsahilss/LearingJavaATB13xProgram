package ResponseValidations;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class CheckCreateddates {
    public static void main(String[] args) {

        String response1 = "{ \"id\": 101, \"name\": \"Sahil Shaikh\", \"job\": \"Automation Tester\", \"createdAt\": \"2025-10-08T10:30:00Z\" }";
        String response2 = "{ \"id\": 102, \"name\": \"Aisha Khan\", \"job\": \"Software Engineer\", \"createdAt\": \"2025-10-08T10:31:00Z\" }";

        JsonPath js1 = new JsonPath(response1);
        JsonPath js2 = new JsonPath(response2);

        String date1 = js1.getString("createdAt");
        String date2 = js2.getString("createdAt");
        int id1 = js1.getInt("id");
        int id2 = js2.getInt("id");

        Assert.assertNotNull(id1, " id is not  null");
        Assert.assertTrue(id1 > 100, "id is created above hundred");
        Assert.assertFalse(id2 < 100, "id less 100");

        //Assert.assertNull(id2," id is null");

        // ✅ 1. Validate format (ISO 8601)
        Assert.assertTrue(date1.endsWith("Z"), "date from invalid");
        Assert.assertTrue(date2.endsWith("Z"), "invalid date format");

        // ✅ 2. Compare that second user’s record created later than first
        Assert.assertTrue(date2.compareTo(date1) > 0, "Second user should be created after first");

        //✅ 3 Date doesn't equal
        Assert.assertNotEquals(date1, date2 , "second user details created later than first");

    }
}
