package ex_09_Switch;

import java.util.Scanner;

public class Lab085_switchWithout_break {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day num(1 t0 7)");

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thur");

            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("Not found");
        }
    }
}
