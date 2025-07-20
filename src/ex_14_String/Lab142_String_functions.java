package ex_14_String;

public class Lab142_String_functions {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
// == Compare the object of reference
// equals --> Compare the content of the Objects
