package ccnumber;

/**
 * This program removes the spaces and dashes from an entered credit card
 * card number. 
 * @author gwestmoreland
 */
public class CCNumber {

    public static void main(String[] args) 
    {
        String creditCardNumber = "4123-5322-1844-7644";
        
        int i = 0; 
        while (i < creditCardNumber.length())
        { 
            char ch = creditCardNumber.charAt(i);
            if (ch == ' ' || ch == '-')
            {
                // Remove the character at position i 
                String before = creditCardNumber.substring(0,i);
                String after = creditCardNumber.substring(i + 1);
                creditCardNumber = before + after; 
            }
            else 
            {
                i++;
            }
        }
        System.out.println(creditCardNumber); 
    }
}
