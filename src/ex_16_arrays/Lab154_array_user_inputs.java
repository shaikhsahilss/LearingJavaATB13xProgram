package ex_16_arrays;

import java.util.Scanner;

public class Lab154_array_user_inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");

        int size = sc.nextInt();

        int [] numbers_marks = new int[size];

        for(int i = 0; i < numbers_marks.length; i++){
            System.out.println("Enter the numbers");
            numbers_marks[i]    = sc.nextInt();
        }
        System.out.println(" ---- below code is the printing the elements");
        for(int i = 0; i < numbers_marks.length; i++){
            System.out.println(numbers_marks[i]);
        }
    }


}
