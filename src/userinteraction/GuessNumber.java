package userinteraction;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 1. generate a random number from 1 to 1000
        int hiddenNumber = (int) (Math.random() * 1000) + 1;
        int lower = 1;
        int upper = 1000;
        boolean correct = false;

        // 2. create a Scanner object to get user input
        Scanner in = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            System.out.println("Guess the number from " + lower + " to " + upper + ": ");
            int input = in.nextInt();
            if (input == hiddenNumber) {
                correct = true;
                break;
            } else if (input > hiddenNumber) {
                upper = input - 1;
            } else {
                lower = input + 1;
            }
        }
        if (correct) {
            System.out.println("Congrats! You found the number!");
        } else {
            System.out.println("Game over... You failed!");
        }
        System.out.println("The hidden number is " + hiddenNumber);
    }
}
