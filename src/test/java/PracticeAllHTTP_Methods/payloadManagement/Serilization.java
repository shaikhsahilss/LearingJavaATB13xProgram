package PracticeAllHTTP_Methods.payloadManagement;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Serilization {
    public static void main(String[] args) {
        Subjects s1 = new Subjects();
        s1.setMath("Math M3");
        s1.setHistory("Geography");

        Subjects s2 = new Subjects();
        s2.setMath("Math M2");
        s2.setHistory("History Modern");
        Subjects s3 = new Subjects();
        s3.setMath("Math M1");
        s3.setHistory("History Modern pro");
        // Add subjects into list
        List<Subjects> subjectsList = new ArrayList<>();
        subjectsList.add(s1);
        subjectsList.add(s2);
        subjectsList.add(s3);

        // Create main payload
        classpayload student = new classpayload();
        student.setName("Sahil");
        student.setStudy("12th class");
        student.setSubjectsList(subjectsList);

        // Serialization (Object -> JSON)
        Gson gson = new Gson();
        String json = gson.toJson(student);

        System.out.println("Serialized JSON: " + json);

       // deserialization
        String json1 = " {\"name\":\"Sahil\",\"study\":\"12th class\",\"subjectsList\":[{\"math\":\"Math M3\",\"history\":\"Geography\"},{\"math\":\"Math M2\",\"history\":\"History Modern\"},{\"math\":\"Math M1\",\"history\":\"History Modern pro\"}]}";

        Gson gson1 = new Gson();

        classpayload student1 = gson1.fromJson(json1 , classpayload.class);
        System.out.println("name :" + student1.getName() );
        System.out.println("First Subject Math :" + student1.getSubjectsList().get(0).getMath());
        System.out.println("study :" + student1.getStudy()) ;
    }
}
