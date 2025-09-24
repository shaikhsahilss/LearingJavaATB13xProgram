package PracticeHTTPMethod2ndRound.module1.Validateresposne;

import io.restassured.path.json.JsonPath;

public class validatereposne {
    public static void main(String[] args) {

        JsonPath js = new JsonPath(payload.wipro());
        int addition = js.getInt("productnumberadd");
        System.out.println(addition);
        int code = js.getInt("responseCode");
        System.out.println(code);
        String text = js.getString("responseText");
        System.out.println(text);
        int Dumber = js.getInt("divisionNumber");
        System.out.println(Dumber);
        int Cnumber = js.getInt("customerNumber");
        System.out.println(Cnumber);
        int count = js.getInt("productList.size()");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int num = js.getInt("productList["+i+"].productNumber");

            sum = sum+num;
        }
        System.out.println(sum);

    }
}
