import java.util.Scanner;

public class HotCold {

    /*
    Write a program that keeps track of how many guesses were needed in a game of "hotter"/"colder".
    The user will enter "hotter", "colder", or "correct". 
    The program should count how many inputs were entered and print it at the end.
    If the user enters anything besides the three strings above, 
    it should print an error message and not count the guess.
    */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter hotter, colder, or correct: ");
        String input = console.next();

        // The count starts off as 0
        int count = 0;

        // we want to continue looping until they finally enter "correct", at which point we stop
        while (!input.equals("correct")) {
            if (input.equals("hotter") || input.equals("colder")) {
                // we only want to increment the count if they entered valid input
                System.out.println("you entered " + input);
                count++;
            } else {
                // if they entered bad input, let them know
                System.out.println("That is not a valid input");
            }

            // ask for the next input
            System.out.print("Enter hotter, colder, or correct: ");
            input = console.next();
        }

        // we have to add one to make sure that we account for the input of "correct"
        count++;

        System.out.println("You entered correct, and it took " + count + " guesses.");
    }
    
}
