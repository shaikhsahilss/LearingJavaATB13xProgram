package ex_04_Operators;

public class Lab048_interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !( balaji_salary > 10) || balaji_salary < 5;
        System.out.println(b);
        // !true == false || false -->> true
    }
}
