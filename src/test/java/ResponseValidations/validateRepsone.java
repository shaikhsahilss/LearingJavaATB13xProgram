package ResponseValidations;

import io.restassured.path.json.JsonPath;

import java.util.List;

public class validateRepsone {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(jsonpayload.getpayload());


        String date = js.getString("accounts[0].transactions[0].date");
        System.out.println(date);
        String state = js.getString("user.contact.address.state");
        System.out.println(state);
        List<String> accountIds = js.getList("accounts.accountId");
        System.out.println(accountIds);
        int size = js.getInt("accounts.size()");
        System.out.println(size);
        List<String> balance = js.getList("accounts.balance");
        System.out.println(balance);

        List<String> roles = js.getList("roles");
        System.out.println(roles);

        double firstamount = js.getDouble("accounts[0].transactions[0].amount");
        System.out.println(firstamount);

        String secondTrax = js.getString("accounts[0].transactions[1].status");
        System.out.println(secondTrax);
        List<String> transactions = js.getList("accounts[1].transactions");
        System.out.println(transactions);
    }

}
