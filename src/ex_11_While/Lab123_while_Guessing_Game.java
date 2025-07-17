package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_while_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();

        int numberToGuess = random.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int guess;
        int attempts = 0;
        while (true){
            guess = sc.nextInt();
            attempts++;

            if(guess < numberToGuess){
                System.out.println("Too low,try again");
            }
            else if(guess > numberToGuess){
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("Correct! You guessed it in " + attempts + "attempts");
            }
        }
    }
}
