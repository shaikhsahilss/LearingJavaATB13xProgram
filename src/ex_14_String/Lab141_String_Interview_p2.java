package ex_14_String;

public class Lab141_String_Interview_p2 {
    public static void main(String[] args) {

        String s1 = "Hello";

        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        // == -> Comparsion -> String -> This check the locations ref
// compare the object reference
        System.out.println(s1 == s3);
        System.out.println( s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals ( Content ) -> value
        //Compare the content of the object

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
    //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
    //  == - check for the ref
    // = assignment the value
}
