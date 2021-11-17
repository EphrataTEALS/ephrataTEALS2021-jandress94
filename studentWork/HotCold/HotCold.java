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

        int count = 0;

        while (!input.equals("correct")) {
            if (input.equals("hotter") || input.equals("colder")) {
                System.out.println("you entered " + input);
                count++;
            } else {
                System.out.println("That is not a valid input");
            }

            System.out.print("Enter hotter, colder, or correct: ");
            input = console.next();
        }
        count++;

        System.out.println("You entered correct, and it took " + count + " guesses.");
    }
    
}
