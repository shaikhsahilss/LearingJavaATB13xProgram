package ex_04_Operators;

public class Lab040_relational_operator {
    public static void main(String[] args) {
        // < less than
        // < =  -- less than or equal
        // > Greater than
        // > = Greater than or equal
        // == Equal to (but checking)
        // !=  Not equal


        // all of them will result boolean output

        int a =10;
        int b = 30;
        boolean c = a < b; // 10 > 30
        System.out.println(c);

        int age_sahil = 27;
        int age_shaikh = 28;

        boolean result = age_shaikh >= age_sahil;
        System.out.println(result);
    }
}
