package PojoSerilizationandDeserilaztionz;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Serilzations {

    private String name;
    private String email;
    private int age;
    private List<address> address;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public List<address> getAddress() {
        return address;
    }
    public  void setAddress (List<address> address){
        this.address = address;
    }

    public static void main(String[] args) {
        address add1 = new address();
        add1.setCity("pune");
        add1.setZip("411057");
        add1.setState("maharashatra");
        address add2= new address();
        add2.setCity("pathardi");
        add2.setZip("414102");
        add2.setState("maharashatra");
        List<address> list = new ArrayList<>();
        list.add(add1);
        list.add(add2);
        Serilzations data = new Serilzations();

        data.setAddress(list);
        data.setAge(28);
        data.setName("sahil");
        data.setEmail("shaikhsahilss2022@gmail.com");

        Gson gson = new Gson();

        String json = gson.toJson(data);
        System.out.println(json);
    }
}
