import javax.swing.JOptionPane;
/**
 This program calculates a running total.  */

public class TotalSales {
    public static void main(String[] args) {
        // The number of days
        int days;
        // A day's sales figure
        double sales;
        // Accumulator
        double totalSales;

        // To hold the user's input
        String input;
        // Get the number of days.
        input = JOptionPane.showInputDialog("For how many days do you have sales figures?");
        days = Integer.parseInt(input);

        // Set the accumulator to 0.
        totalSales = 0.0;

        // Get the sales figures and calculate a running total.
        for (int count = 1; count <= days; count++) {
            input = JOptionPane.showInputDialog("Enter the sales for day " + count + ": ");
            sales = Double.parseDouble(input);
            totalSales += sales; // Add sales to totalSales.
        }
            // Display the total sales.
            JOptionPane.showMessageDialog(null,
                    String.format("The total sales are $%,.2f", totalSales));
            System.exit(0);
    }
}
