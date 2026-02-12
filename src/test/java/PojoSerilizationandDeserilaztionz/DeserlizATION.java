package PojoSerilizationandDeserilaztionz;

import com.google.gson.Gson;

public class DeserlizATION {
    public static void main(String[] args) {


        Gson gson = new Gson();
        String payload = "{\"name\":\"sahil\",\"email\":\"shaikhsahilss2022@gmail.com\",\"age\":28,\"address\":[{\"city\":\"pune\",\"state\":\"maharashatra\",\"zip\":\"411057\"},{\"city\":\"pathardi\",\"state\":\"maharashatra\",\"zip\":\"414102\"}]}\n";

        Serilzations javaobject = gson.fromJson(payload, Serilzations.class);

        System.out.println(javaobject.getEmail());
        System.out.println(javaobject.getName());
    }
}
