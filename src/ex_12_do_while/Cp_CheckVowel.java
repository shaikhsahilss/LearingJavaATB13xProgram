package ex_12_do_while;

import java.util.Scanner;

public class Cp_CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single alphabet");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonants");
        }
    }

}
