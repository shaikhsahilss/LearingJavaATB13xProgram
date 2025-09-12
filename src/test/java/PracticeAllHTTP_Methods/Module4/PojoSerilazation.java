package PracticeAllHTTP_Methods.Module4;

import com.google.gson.Gson;

class Student{
    private  String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
public class PojoSerilazation {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // create java Object
        Student student = new Student("sahil",25);
        // Serialization Object -> Json

        String json = gson.toJson(student);
        System.out.println("Serilized " + json);
    }


}
