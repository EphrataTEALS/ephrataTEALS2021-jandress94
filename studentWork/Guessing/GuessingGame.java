import java.util.*;

public class GuessingGame {
    /*
    Create a guessing game, where the computer chooses a random number from 1 to 10, 
    the user enters a guess, and the computer tells us whether we were too high, too low, or correct.
    If the user didn't guess correctly, they can then guess again.

    - play game
        - choose the computer's number
        - get the user's guess
        - evaluate the guess
    */

    public static void main(String[] args) {
        // for now, just hardcode the computer's guess
        int computerGuess = getComputerGuess();

        // get the user's first guess
        int guess = getGuess();
        System.out.println("You guessed " + guess);

        while (!guessIsCorrect(computerGuess, guess)) {
            guess = getGuess();
        }

        System.out.println("You got it right!");
    }

    public static int getComputerGuess() {
        Random r = new Random();
        int computerGuess = r.nextInt(10) + 1;
        return computerGuess;
    }

    public static int getGuess() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int myGuess = console.nextInt();
        return myGuess;
    }

    public static boolean guessIsCorrect(int computerGuess, int guess) {
        if (guess == computerGuess) {
            return true;
        } else if (guess > computerGuess) {
            System.out.println("Your guess was too large.");
        } else {
            System.out.println("Your guess was too small.");
        }
        return false;
    }
}
