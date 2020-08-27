import java.util.Scanner;
/**
 * This program demonstrates a user controlled for loop.
 */

public class UserSquares {
    public static void main(String[] args) {
        // Loop control variable
        int number;

        // Maximum value to display
        int maxValue;

        System.out.println("I will display a table of numbers and their squares.");

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the maximum value to display.
        System.out.print("How high should I go? ");
        maxValue = keyboard.nextInt();

        // Display the table.
        System.out.println("Number Number Squared");
        System.out.println(" ");

        // For Loop
        for (number = 1; number <= maxValue; number++) {
            System.out.println(number + "\t\t" + number * number);
        }
    }
}