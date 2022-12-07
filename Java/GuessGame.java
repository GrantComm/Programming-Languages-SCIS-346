// Grant Commodore

/* This program generates a random number between 0 and 100.  Then, it allows the user 10 guesses.
If the guess is correct, "You guessed it! The number was" is printed along with the number. If 
the guess was too high or too low, the user is notified and another guess is accepted .If the 
user does not guess in 10 guesses, "you lose, the number was" is printed along with the number. */
import java.util.Scanner;

public class GuessGame {

    // Method that generates a random number between 0 and 100.
    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    // Method that checks if the guess is correct.
    public static boolean checkGuess(int guess, int random, int numGuesses) {
        // If the guess is correct, print "You guessed it! The number was" is printed
        // along with the number.
        if (guess == random) {
            System.out.println("You guessed it! The number was " + random + ".");
            return true;
            // If the guess was too high, print "Too high, try again."
        } else if (guess > random && numGuesses < 10) {
            System.out.println("Too high, try again.");
            return false;
            // If the guess was too low, print "Too low, try again."
        } else if (guess < random && numGuesses < 10) {
            System.out.println("Too low, try again.");
            return false;
            // If the user does not guess in 10 guesses, print "you lose, the number was" is
            // printed along with the number.
        } else {
            System.out.println("You lose, the number was " + random + ".");
            return false;
        }
    }

    // Main method that begins the execution of the Guessing Game.
    public static void main(String[] args) {
        int random = generateRandom();
        int guess = 0;
        int guessCount = 1;
        System.out.println("Welcome to the Guess Game!");
        System.out.println("You have 10 guesses to guess the random number between 0 and 100.");
        System.out.println("--------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        // While loop that continues to run until the user guesses the correct number or
        // the user runs out of guesses.
        while (guessCount <= 10) {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            if (checkGuess(guess, random, guessCount)) {
                break;
            }
            guessCount++;
        }

        // Close the Scanner.
        input.close();
    }

}
