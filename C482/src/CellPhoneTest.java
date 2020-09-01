import java.util.Scanner;

/**
 * This program runs a simple test of the CellPhone class
 */

public class CellPhoneTest {
    public static void main(String[] args) {
        String testMan; // To hold a manufacturer
        String testMod; // To hold a model number
        Double testPrice; // To hold a price

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get manufacturer name
        System.out.println("Enter the name of the cell phone's manufacturer: ");
        testMan = keyboard.nextLine();

        // Get the model number
        System.out.println("Enter the model number of the cell phone: ");
        testMod = keyboard.nextLine();

        // Get the retail price of the cell phone
        System.out.println("Enter the retail price of the cell phone: ");
        testPrice = keyboard.nextDouble();

        // Create an instance of teh CellPhone class while passing the data that was entered
        // into arguments to the constructor
        CellPhone phone = new CellPhone(testMan, testMod, testPrice);

        // Get the data from the phone from CellPhone.java file and display it.
        System.out.println(); // skip to the next line or blank line inserted
        System.out.println("Here is the data that you provided about your cell phone.");
        System.out.println("Manufacturer is " + phone.getManufact());
        System.out.println("Model is " + phone.getModel());
        System.out.println("Retail price is $" + phone.getRetailPrice());
    }
}
