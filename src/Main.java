/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * at the time of declaration using String.join() to create each line
 * of the banner. This improves code readability and maintainability.
 *
 * @author Bharati
 * @version 5.0
 */
public class Main {

    public static void main(String[] args) {

        String[] lines = {
                String.join(" ",
                        "   ***   ", "   ***   ", "  *****  ", "  *****  "),
                String.join(" ",
                        " **   ** ", " **   ** ", " **   ** ", " **      "),
                String.join(" ",
                        " **   ** ", " **   ** ", " **   ** ", " **      "),
                String.join(" ",
                        " **   ** ", " **   ** ", "  *****  ", "  *****  "),
                String.join(" ",
                        " **   ** ", " **   ** ", " **      ", "      ** "),
                String.join(" ",
                        " **   ** ", " **   ** ", " **      ", "      ** "),
                String.join(" ",
                        "   ***   ", "   ***   ", " **      ", "  *****  ")
        };

     for (String line : lines) {
            System.out.println(line);
        }
    }
}