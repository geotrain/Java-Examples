package milespergallon;

// Import Necessary Java Utility Libraries
import java.util.Scanner; 

/**
 * The purpose of this application is to take user input and then convert
 * the data into miles per gallon used.
 * @author gwestmoreland
 */
public class MilesPerGallon {

    public static void main(String[] args) 
    {
        // Declare variables to use in program
        double milesDriven, fuelUsed, milesPerGallon;
        // Declare scanner with variable name userInput and System.in
        Scanner userInput = new Scanner(System.in);
        // Ask user for the amount of miles driven
        System.out.print("Enter the number of miles driven since last fill up: ");
        // Store amount entered by user in variable name milesDriven double variable expected
        milesDriven = userInput.nextDouble(); 
        // Ask user for the amount of fuel used
        System.out.print("Enter the amount of fuel used since last fill up: ");
        // Store fuel entered by user in variable name fuelUsed double variable expected
        fuelUsed = userInput.nextDouble();
        // Calculate: miles driven divided fuel used equals miles per gallon
        milesPerGallon = milesDriven / fuelUsed; 
        // Output the variable milesPerGallon to the screen to show user the average miles per gallon used since last fill up
        System.out.println("You averaged  " + milesPerGallon + "  miles per gallon since "+ "your last fill up.");
    }
}
