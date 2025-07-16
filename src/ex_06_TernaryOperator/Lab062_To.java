package ex_06_TernaryOperator;

import com.sun.jdi.connect.Connector;

public class Lab062_To {
    public static void main(String[] args) {
        //age to vote?
        int age = 20;
        String canI_vote = age > 18 ? "Yes" : "No";
        System.out.println(canI_vote);
    }
}
