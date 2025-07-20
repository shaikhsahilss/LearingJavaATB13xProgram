package ex_16_arrays;

import java.util.Arrays;

public class Lab152_Arrays_print {
    public static void main(String[] args) {

        int [] marks = {51,100,91,87,90};
        System.out.println("________");

        //Print all the arrays
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        // Arrays with sequence
        Arrays.sort(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
