/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * Uses String array to store banner lines and prints them using
 * an enhanced for-loop. Each line is constructed using String.join()
 * with correct spacing to maintain banner alignment.
 *
 * @author Bharati
 * @version 4.0
 */

public class Main {

    public static void main(String[] args) {

        String[] lines = new String[7];
        lines[0] = String.join(" ",
                "   ***   ", "   ***   ", "  *****  ", "  *****  ");

        lines[1] = String.join(" ",
                " **   ** ", " **   ** ", " **   ** ", " **      ");

        lines[2] = String.join(" ",
                " **   ** ", " **   ** ", " **   ** ", " **      ");

        lines[3] = String.join(" ",
                " **   ** ", " **   ** ", "  *****  ", "  *****  ");

        lines[4] = String.join(" ",
                " **   ** ", " **   ** ", " **      ", "      ** ");

        lines[5] = String.join(" ",
                " **   ** ", " **   ** ", " **      ", "      ** ");

        lines[6] = String.join(" ",
                "   ***   ", "   ***   ", " **      ", "  *****  ");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
