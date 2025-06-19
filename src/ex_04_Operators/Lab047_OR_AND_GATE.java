package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND && // only true && true returns true
        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


    }
}
