package ex_08_if_conditiond;

import java.util.Scanner;

public class Lab080_if {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>18){

            System.out.println("Allowed to vote");
        }
    }

}
