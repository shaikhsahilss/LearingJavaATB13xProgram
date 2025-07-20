package ex_16_arrays;

import java.util.Arrays;

public class Lab157_Interview_Q {
    public static void main(String[] args) {

        // find the second leargets number in an array
        int numbers [] = {12,34,10,1,100,3,4,32};

        // 100 ,34
        Arrays.sort(numbers);
        System.out.println(numbers.length-2);
        System.out.println(numbers.length-3);

        // You find it without using the sort functions
    }
}
