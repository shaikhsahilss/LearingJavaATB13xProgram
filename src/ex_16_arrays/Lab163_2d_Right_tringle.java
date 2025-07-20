package ex_16_arrays;

import java.util.Scanner;

public class Lab163_2d_Right_tringle {
    public static void main(String[] args) {


        System.out.println("Enter the n e.g n=3");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
