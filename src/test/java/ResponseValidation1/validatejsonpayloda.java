package ResponseValidation1;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.List;

public class validatejsonpayloda {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(jsonpayload1.json());

       String account = js.getString("user.profile.socialAccounts[0].connected");
        System.out.println(account);

        Assert.assertEquals(account,"true" );

        String city = js.getString("user.contact.addresses[1].city");
        System.out.println(city);

        List<String> accouts = js.getList("accounts[0].transactions");

        System.out.println(accouts);
        String status1 = js.getString("accounts[0].transactions[0].status");

        System.out.println(status1);
        String status2 = js.getString("accounts[0].transactions[1].status");

        System.out.println(status2);

        Assert.assertNotEquals(status2,status1 ," both status are diffrent");

        int count = js.getInt("accounts[0].transactions.size()");
        System.out.println(count);
        int sum =0;
        for(int i =0; i < count; i++){
            double ammount = js.getDouble("accounts[0].transactions["+i+"].amount");
            int amoun = (int) ammount;
            sum = sum + amoun;
        }
        System.out.println(sum);

        List<String> accountid = js.getList("accounts.accountId");
        System.out.println(accountid);

        Assert.assertTrue(js.getString("accounts[0].accountId").contains("ACC1002"));

    }
}
