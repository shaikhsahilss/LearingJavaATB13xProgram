package PracticeHTTPmethods.module1.ValidateResponseWipro;

import io.restassured.path.json.JsonPath;


public class validateResponse {
    public static void main(String[] args) {
        JsonPath js =  new JsonPath(payload2.getdata());
      String title = js.getString("books[0].title");
        System.out.println(title);
        int price = js.getInt("books[0].price");
        System.out.println(price);
        int size = js.getInt("books.size()");
        int total = js.getInt("totalValue");
        System.out.println(total);

        int sum = 0;
        for(int i =0; i < size; i++){

            int all_price = js.getInt("books["+i+"].price");
            sum = sum + all_price;
            System.out.println(all_price);
        }
        if(sum == total ){
            System.out.println("test case passed");
        }
    }
}
