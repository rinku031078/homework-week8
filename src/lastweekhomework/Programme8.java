package lastweekhomework;
/*
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Locale;
import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        cityName();

    }

    static String alphabet;//create variable

    public static void cityName() {
        Scanner obj = new Scanner(System.in);//object for scanner
        System.out.println("Enter alphabet");//asking user to enter
        alphabet = obj.nextLine();//call
        if (alphabet.toUpperCase(Locale.ROOT).equals("A"))

            System.out.println("Ahmedabad");
        else if (alphabet.toUpperCase(Locale.ROOT).equals("B"))

            System.out.println("Bhopal");
        else if (alphabet.toUpperCase(Locale.ROOT).equals("C"))
            System.out.println("Channai");

        else if (alphabet.toUpperCase(Locale.ROOT).equals("D"))
            System.out.println("Delhi");

        else if (alphabet.toUpperCase(Locale.ROOT).equals("E"))
            System.out.println("Ellisbridge");

        else if (alphabet.toUpperCase(Locale.ROOT).equals("F"))
            System.out.println("Falna");

        else
            System.out.println("Invalid input");

    }
}
