
/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate
 * each letter's pattern through dedicated methods. This enhances code
 * reusability and maintainability by separating pattern generation logic
 * from the main display logic.
 *
 * @author Bharati
 * @version 6.0
 */
public class Main {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
    	return new String[] {
                String.join("", "   ***   "),
                String.join("", " **   ** "),
                String.join("", " **   ** "),
                String.join("", " **   ** "),
                String.join("", " **   ** "),
                String.join("", " **   ** "),
                String.join("", "   ***   ")
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
                String.join("", "  *****  "),
                String.join("", " **   ** "),
                String.join("", " **   ** "),
                String.join("", "  *****  "),
                String.join("", " **      "),
                String.join("", " **      "),
                String.join("", " **      ")
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
                String.join("", "  *****  "),
                String.join("", " **      "),
                String.join("", " **      "),
                String.join("", "  *****  "),
                String.join("", "      ** "),
                String.join("", "      ** "),
                String.join("", "  *****  ")
       };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
        	System.out.println(
                    String.join(" ",
                            oPattern[i],
                            oPattern[i],
                            pPattern[i],
                            sPattern[i]
                    )
            );
        }
    }
}
