package homework;
/*
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme8 {

    /*
   Display right angle triangle of @ using nested for loops
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
