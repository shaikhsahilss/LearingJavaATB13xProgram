package InterviewPre;


import io.restassured.path.json.JsonPath;

public class ValidatesBodyJson {
    public static void main(String[] args) {

        JsonPath js = new JsonPath(payload3.getdata());
        int count = js.getInt("books.size()");
        System.out.println(count);
          int  sum = 0;
        for(int i =0; i < count; i++){
            int all = js.getInt("books["+i+"].price");
            sum = sum +all;
            System.out.println(all);
        }
        System.out.println(sum);
    }
}
