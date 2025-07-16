package ex_09_Switch;

import java.util.Scanner;

public class Lab086_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day num ( 1 to 7");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tue");
                break;
        }
    }
}
