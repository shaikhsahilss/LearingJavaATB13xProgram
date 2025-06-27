package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        // byte b = val;
        // Narrowing (int -> byte)
        //Implicit casting is not allowed
        byte b1 =(byte)val;

        // data loss

        System.out.println(b1);
    }
}
