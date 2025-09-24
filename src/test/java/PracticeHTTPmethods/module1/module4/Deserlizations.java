package PracticeHTTPmethods.module1.module4;


import com.google.gson.Gson;

class student{
    private String name;
    private int age;

    // Getters (for accessing values)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Deserlizations {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"name\":\"Sahil\",\"age\":25}";

        student st = gson.fromJson(json,student.class);

        System.out.println("Deserialized object :" +st.getName()+" ,"+ st.getAge());


    }

}
