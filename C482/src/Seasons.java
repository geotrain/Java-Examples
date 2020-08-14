import java.util.Scanner;

/**
 This program translates the English names of
 the seasons into Spanish.
 */

public class Seasons {
    public static void main(String[] args) {
        String input;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a day from the user.
        System.out.print("Enter the name of a season to translate into Spanish: ");
        input = keyboard.nextLine();

        // Translate the season to Spanish.
        switch (input) {
            case "spring":
                System.out.println("The Spanish word for spring is \"la primavera\"");
                break;
            case "summer":
                System.out.println("The Spanish word for summer is \"el verano\"");
                break;
            case "autumn":
                System.out.println("The Spanish word for autumn is \"el otono\"");
                break;
            case "fall":
                System.out.println("The Spanish word for fall is \"el otono\"");
                break;
            case "winter":
                System.out.println("The Spanish word for winter is \"el invierno\"");
                break;
            default:
                System.out.println("Please enter one of these words: \n"+
                        "spring, summer, autumn, fall, or winter.");
        }
    }
}