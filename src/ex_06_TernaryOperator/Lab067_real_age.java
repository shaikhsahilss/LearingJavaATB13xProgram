package ex_06_TernaryOperator;

public class Lab067_real_age {
    public static void main(String[] args) {
        int age = 76;
        String result = (age < 18) ? "minor" : (age < 65) ? "adult" :"senior";
        System.out.println(result);
    }
}
