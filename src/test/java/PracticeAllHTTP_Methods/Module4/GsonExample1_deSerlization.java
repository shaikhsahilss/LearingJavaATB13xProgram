package PracticeAllHTTP_Methods.Module4;


import com.google.gson.Gson;

class Student1 {
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

public class GsonExample1_deSerlization {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // JSON string
        String json = "{\"name\":\"Sahil\",\"age\":25}";

        // Deserialization: JSON -> Object
        Student1 student = gson.fromJson(json, Student1.class);

        System.out.println("Deserialized Object: " + student.getName() + ", " + student.getAge());
    }
}