package ex_05_TypeCasting;

public class Lab060_TypeCasting_ {
    public static void main(String[] args) {
        long phone = 8805717818l;
      //  short s = phone; Implicit narrow
        short s1 =(short) phone;//  Explicit narrow
    }
}
