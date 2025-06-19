package Coding_test;

import java.util.Scanner;

public class challenge_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a <= 20){
            System.out.println("Positive Number"+a);
        }
        if(b >= -10){
            System.out.println("negative number"+b);
        }
        if(c==0){
            System.out.println("zero number"+c);
        }



    }
}
