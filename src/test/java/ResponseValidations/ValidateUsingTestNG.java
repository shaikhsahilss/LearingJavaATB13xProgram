package ResponseValidations;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.List;

public class ValidateUsingTestNG {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(jsonpayload.getpayload());

        // validate user details
        Assert.assertEquals(js.getDouble("user.contact.address.coordinates.lat"), 18.5204, "Latitude mismatch");
        Assert.assertEquals(js.getString("user.name"), "Sahil Shaikh", "username mismatch");
        Assert.assertEquals(js.getString("user.contact.address.city"), "Pune" , "city mismatch");
        // validate account
        Assert.assertTrue((js.getString("accounts[0].accountId")).contains("ACC1001"), "account id founds");
        List<String> accountid = js.getList("accounts.accountId");
        Assert.assertTrue(accountid.contains("ACC1001"), "account not fount");

        // validate the first account balance
        Assert.assertEquals(js.getDouble("accounts[0].balance"),50000.75, " balance mismatch");
        Assert.assertTrue(js.getDouble("accounts[0].balance") > 0 , "account balanace should be greather than");

        // validate the transaction status

        String status = js.getString("accounts[0].transactions[0].status");
        Assert.assertEquals(status,"Success" ,"status is mismatch");

        // Validate roles list
        List<String> roles = js.getList("roles");

        Assert.assertTrue(roles.contains("editor") , "not matched");
        Assert.assertEquals(roles.size(),3 , "Yes size is 3");
        // 6️⃣ Validate boolean and date fields

        String dates = js.getString("accounts[0].transactions[1].date");
        Assert.assertTrue(dates.contains("2025-10-06"), "date mis match");

        Assert.assertTrue(dates.startsWith("2025-10-06") , " date mismatch");

    }
}
