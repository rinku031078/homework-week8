package homework;
/*
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean hasmax = false;
        boolean hasmin = false;

        while (true) {
            System.out.println("Enter number:");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input > max || !hasmax) {
                    max = input;
                    hasmin = true;
                }
                if (input > min || !hasmin) {
                    min = input;
                    hasmin = true;
                }

            } else {
                System.out.println("min = " + max);
                System.out.println("max = " + min);
                break;
            }
        }
    }
}