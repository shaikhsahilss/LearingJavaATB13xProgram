package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST;// narrow- Implicit
        int total1 = course+(int)GST;// narrow - Explicit
        System.out.println(total1);


        float total12 = course+(int)GST;// widening - auto - implicit
        float total13 = (float)course+GST;// widening - Explicit
        System.out.println(total12);
        System.out.println(total13);
    }
}
