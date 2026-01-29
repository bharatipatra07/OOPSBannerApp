/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() instead of the +
 * operator to build each line of the "OOPS" banner.
 *
 * Using String.join() reduces intermediate String object creation,
 * improves memory efficiency, and enhances readability.
 *
 * @author Bharati
 * @version 3.0
 */

public class Main {

    public static void main(String[] args) {

        // Hint: Use String.join(" ", ...) to join the parts of each line with spaces.

        System.out.println(String.join(" ",
                "  ***  ", "  ***  ", " ***** ", " ***** "
        ));

        System.out.println(String.join(" ",
                " **   ** ", " **   ** ", " **    ", " **    "
        ));

        System.out.println(String.join(" ",
                " **   ** ", " **   ** ", " **    ", " **    "
        ));

        System.out.println(String.join(" ",
                " **   ** ", " **   ** ", " ***** ", " ***** "
        ));

        System.out.println(String.join(" ",
                " **   ** ", " **   ** ", " **    ", "    ** "
        ));

        System.out.println(String.join(" ",
                " **   ** ", " **   ** ", " **    ", "    ** "
        ));

        System.out.println(String.join(" ",
                "  ***  ", "  ***  ", " **    ", " ***** "
        ));
    }
}
