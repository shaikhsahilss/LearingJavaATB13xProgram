package ex_003_javBasic;

public class Lab0024_printF {
    public static void main(String[] args) {
        int a =10;
        System.out.println("print command print without the new line");

        System.out.println("hello wolrd");

        System.out.println("add the new line in the end");
        System.out.println(a);

        System.out.printf("Your variable name is %d", a);
        //%d -> int , byte , long, short, -- data type
        // %s -> String
        //%f --> float, double
        // %b --> boolean

        int b = 20;
        System.out.println("_____");

        System.out.printf("%d X %d", a,b);


    }
}
