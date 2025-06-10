package ex_01_Java_Basic;

import java.util.*;

public class Lab003 {

    public static void main(String[] args) {

        String num = "1,2,3,4,5,-1,2,-3,-10";
        String[] a = num.split(",");

        List<Integer> a1 = new ArrayList<>();

        for (String b : a){
            a1.add(Integer.parseInt(b));
        }

        Collections.sort(a1);
        System.out.println(a1);

        //This is a comment, this code will not be executed
    }
}
