import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 5;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");

            for (int i = 0; i < 5; i++) {
                int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
                int attemptsLeft = maxAttempts;

                System.out.println("\nRound " + (i + 1) + ":");
                System.out.println("Guess the number between " + minRange + " and " + maxRange);

                while (attemptsLeft > 0) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();

                    if (userGuess == numberToGuess) {
                        System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                        score++;
                        break;
                    } else if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }

                    attemptsLeft--;
                    if (attemptsLeft > 0) {
                        System.out.println("Attempts left: " + attemptsLeft);
                    }
                }

                if (attemptsLeft == 0) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
                }

                System.out.println("Your current score: " + score);
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            System.out.println("Thanks for playing! Your final score: " + score);
        }
    }
}