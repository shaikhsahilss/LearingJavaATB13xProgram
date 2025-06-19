package ex_04_Operators;

public class Lab043_interview_concat_plus {
    public static void main(String[] args) {

        String first_name = "sahil";
        String last_name = "shaikh";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a +b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
        // BODMAS - bracket pf div, mul, add, sub
    }
}
