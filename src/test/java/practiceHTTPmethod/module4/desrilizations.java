package practiceHTTPmethod.module4;

import com.google.gson.Gson;

public class desrilizations {
    public static void main(String[] args) {
        String data ="{\"name\":\"sahil\",\"job\":\"QA\",\"places\":[{\"city\":\"pathardi\",\"distict\":\"nagar\",\"mobile\":880571781},{\"city\":\"pune\",\"distict\":\"pune only\",\"mobile\":234678}]}\n";

        Gson gson = new Gson();

        serilization d1 = gson.fromJson(data,serilization.class);
        String date = d1.getName();
        System.out.println(date);
        System.out.println(d1.getPlaces());
    }
}
