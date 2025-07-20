package ex_16_arrays;

import java.util.Scanner;

public class Lab164_2d_Multiplications {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size");
        int Size_of_The_table = sc.nextInt();

        for(int i = 0; i < Size_of_The_table; i++){
            for (int j = 0; j < Size_of_The_table; j++){
                System.out.println(i*j+" | ");
            }
            System.out.println();
        }
    }
}
