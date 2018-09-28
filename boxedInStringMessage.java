package boxspring;

/**
 * This Prints out A String Message Surrounded by --- 
 * @author gwestmoreland
 */
public class BoxSpring {

        public static void main(String[] args) {
        String contents = "Greg Westmoreland";
        int n = contents.length();
        for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
        System.out.println();
        System.out.println("!" + contents + "!");
        for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
        System.out.println();
    }
    
}
