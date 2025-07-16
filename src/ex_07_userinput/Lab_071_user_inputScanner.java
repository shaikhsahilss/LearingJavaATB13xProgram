package ex_07_userinput;

import java.util.Scanner;

public class Lab_071_user_inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");

        int age = sc.nextInt();

        String canIvote = age >= 18 ? "yes":"No";

        System.out.println(canIvote);

    }
}
