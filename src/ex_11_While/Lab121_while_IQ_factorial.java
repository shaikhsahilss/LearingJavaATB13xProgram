package ex_11_While;

import java.util.Scanner;

public class Lab121_while_IQ_factorial
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the factorial program\nEnter the number!");

        if(!sc.hasNextInt()){
            System.out.println("Enter the int u fool");
            return;
        }

        int number = sc.nextInt();

        long factorial =1 ;

        if(number < 0)
        {
            System.out.println("Negative factorial is not allowed");
            return;
        }
        if( number<=0)
        {
            System.out.println(factorial);
        }
        else {
            for (int i =1; i <= number;i++){
                factorial = factorial*i;
            }
        }
        System.out.println("factorial is -> "+factorial);
    }
}
