package ex_09_Switch;

import java.util.Scanner;

public class Lab084_switch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");

        int day = sc.nextInt();

        switch (day){
            case 1 :
                System.out.println("sun");
                break;
            case 2 :
                System.out.println("Mon");
                break;
            case 3 :
                System.out.println("tue");
                break;
            case 4 :
                System.out.println("wed");
                break;
            case 5 :
                System.out.println("thur");
                break;
            case 6 :
                System.out.println("fri");
                break;
            case 7 :
                System.out.println("sat");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
