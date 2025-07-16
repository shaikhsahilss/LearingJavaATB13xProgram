package ex_07_userinput;

import java.util.Scanner;

public class Lab_072_user_input_scanner {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(s);

        System.out.println("Enter the Int");

        int int_put = sc.nextInt();
        System.out.println(int_put);

        System.out.println("Enter the Double");

        double double_input = sc.nextDouble();

        System.out.println(double_input);
    }
}
