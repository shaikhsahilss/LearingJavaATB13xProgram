package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Input!");

        String input = sc.next();

        int vowel = 0;
        int consonants = 0;

        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch =='o' || ch== 'u'){
                vowel++;
            }else {
                consonants++;
            }

        }
        System.out.println(vowel);
        System.out.println(consonants);


    }
}
