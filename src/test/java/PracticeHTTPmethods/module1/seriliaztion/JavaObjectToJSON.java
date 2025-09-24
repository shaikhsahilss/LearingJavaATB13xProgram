package PracticeHTTPmethods.module1.seriliaztion;

import com.google.gson.Gson;

public class JavaObjectToJSON {
    private String name;
    private String job;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job=job;
    }

    public static void main(String[] args) {
      Gson gson = new Gson();
      //serilization
//        JavaObjectToJSON JsonPayload = new JavaObjectToJSON();
//        JsonPayload.setName("sahil");
//        JsonPayload.setJob("QA");
//
//        String json = gson.toJson(JsonPayload);
//        System.out.println(json);

        String payload ="{\"name\":\"sahil\",\"job\":\"QA\"}";
        // deserilizations
        JavaObjectToJSON javaObject = gson.fromJson(payload,JavaObjectToJSON.class);
        System.out.println(javaObject.getName());
        System.out.println(javaObject.getJob());

    }
}
