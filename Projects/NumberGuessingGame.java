package Projects;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int random_value = (int) (Math.random() * 100 + 1);
        int user_guess;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.err.println("Guess a Number: ");
            user_guess = sc.nextInt();

            if (user_guess == random_value) {
                System.err.println("Congratulation you guess the correct number in: " + i);
                break;
            }
            if (Math.abs(user_guess - random_value) <= 5) {
                System.err.println("Your Guess is Very close to the Actual Number.");
            }

            if (user_guess > random_value) {
                System.err.println("Your guess is greater then the actual number. ");
            }
            if (user_guess < random_value) {
                System.err.println("Your guess is Lower then the actual number. ");
            }

        }
    }
}
