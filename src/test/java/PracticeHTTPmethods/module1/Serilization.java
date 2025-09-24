package PracticeHTTPmethods.module1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Serilization {

    private String name;

    private String job;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public static void main(String[] args) {



//        Serilization data1 = new Serilization();
//        data1.setName("sandeep");
//        data1.setJob("devOps");
//        Serilization JsonPayload = new Serilization();
//        JsonPayload.setName("sahil");
//        JsonPayload.setJob("QA engineer");
//
//        List<Serilization> emp = new ArrayList<>();
//        emp.add(JsonPayload);
//        emp.add(data1);
        Gson gson = new Gson();

        String payload ="[{\"name\":\"sahil\",\"job\":\"QA engineer\"},{\"name\":\"sandeep\",\"job\":\"devOps\"}]\n";
        Serilization [] json = gson.fromJson(payload , Serilization [].class);

        for(Serilization emp : json){
            System.out.println(emp.getName() +"   --- job :" + emp.getJob());
        }



        //String json = gson.toJson(emp);
        //.out.println(json);
    }
}
