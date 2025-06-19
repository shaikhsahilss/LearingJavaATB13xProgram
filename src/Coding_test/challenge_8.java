package Coding_test;

import java.util.Scanner;

public class challenge_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        boolean leapY = false;
        if( a%4 == 0 && a % 100 != 0 || a % 400 == 0){
            leapY = true;

        }
        if(leapY){
            System.out.println("This is a leap year: "+ a);
        }
        else {
            System.out.println("This is not a leap year: "+ a);

        }
    }
}
