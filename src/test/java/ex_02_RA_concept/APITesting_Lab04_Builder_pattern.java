package ex_02_RA_concept;

public class APITesting_Lab04_Builder_pattern {
    public APITesting_Lab04_Builder_pattern Step1(){
        System.out.println("Step");
        return this;
    }
    public APITesting_Lab04_Builder_pattern Step2(){
        System.out.println("Step2");
        return this;


    }
    public  APITesting_Lab04_Builder_pattern step3(String sahil1){
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_Builder_pattern np = new APITesting_Lab04_Builder_pattern();

        np.Step1().step3("sahil").Step2();
    }
}
