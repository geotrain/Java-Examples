/**
 * This program displays a table of speeds in kph converted to mph.
 */

public class SpeedConverter {
    public static void main(String[] args) {

        // Starting speed
        final int STARTING_KPH = 60;

        // Maximum speed
        final int MAX_KPH = 130;

        // Speed increment
        final int INCREMENT = 10;

        // To hold the speed in kph
        int kph;
        // To hold the speed in mph
        double mph;

        // Display the table headings.
        System.out.println("KPH\t\tMPH");
        System.out.println(" ");

        // Display the speeds.
        for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT) {
            // Calculate the mph.
            mph = kph * 0.6214;

            // Display the speeds in kph and mph.
            System.out.printf("%d\t\t%.1f\n", kph, mph);
        }
    }
}