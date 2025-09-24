package InterviewPre;

import com.google.gson.Gson;

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

        Gson gson = new Gson();

        Serilization data = new Serilization();
        data.setName("sahil");
        data.setJob("QA");

       String json = gson.toJson(data);
        System.out.println(json);
        //de srilizationbs

        Gson gson1 = new Gson();

        String payload = "{\"name\":\"sahil\",\"job\":\"QA\"}";

        Serilization [] j1 = gson1.fromJson(payload,Serilization[] .class);

     //
    }

}
