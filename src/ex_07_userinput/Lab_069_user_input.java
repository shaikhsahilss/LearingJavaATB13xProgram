package ex_07_userinput;

import javax.sound.midi.Soundbank;

public class Lab_069_user_input {
    public static void main(String[] args) {
        String age = args[0];
        System.out.println(age);

        int age1 = Integer.parseInt((age));
        String canIvote = age1 >= 18 ? "Yes" : "No";
        System.out.println(canIvote);
    }
}
