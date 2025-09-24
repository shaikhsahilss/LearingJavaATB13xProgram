package PracticeHTTPmethods.module1.module4;
import com.google.gson.Gson;

import static io.restassured.RestAssured.given;

class Student{
    private  String name;

    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
        public int getAge(){
        return age;
        }
    public void setAge(int age)
    {
        this.age =age;
    }
}
public class Serlization {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student();
        student.setName("sahil");
        student.setAge(27);
        // Serialization Object -> Json
        String json = gson.toJson(student);
        System.out.println("seriliazed :" + json);

    }


}
