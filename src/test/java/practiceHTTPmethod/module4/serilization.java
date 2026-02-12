package practiceHTTPmethod.module4;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class serilization {

    private String name;
    private String job;
    private List<place> places;
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
    public List<place> getPlaces(){
        return places;
    }
    public void setPlaces(List<place> places)
    {
        this.places=places;
    }

    public static void main(String[] args) {
        place p1 = new place();
        p1.setCity("pathardi");
        p1.setDistict("nagar");
        p1.setMobile(880571781);
        place p2 = new place();
        p2.setCity("pune");
        p2.setDistict("pune only");
        p2.setMobile(234678);

        List<place> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        serilization s1 = new serilization();
       s1.setName("sahil");
       s1.setJob("QA");
       s1.setPlaces(list);

       Gson gson = new Gson();

       String json = gson.toJson(s1);
        System.out.println(json);

    }
}
