package ex_02_RA_concept;

public class APITesting_Lab03_NP {
    public void Step1(){
        System.out.println("Step");

    }
    public void Step2(){
        System.out.println("Step2");


    }
    public  void step3(String sahil1){
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITesting_Lab03_NP np = new APITesting_Lab03_NP();
        np.Step1();
        np.step3("sahil");
        np.Step2();
    }
}
