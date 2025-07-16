package ex_08_if_conditiond;

import java.util.Scanner;

public class Lab082_if_else {
    public static void main(String[] args) {


        System.out.println("enter the age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int a= 10;

        if( age <=18){

            System.out.println("Not allowed to vote");
        }
        else {
            System.out.println("Allowed to vote");
        }
    }
}
