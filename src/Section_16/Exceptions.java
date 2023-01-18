package Section_16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Jason D'Oyley
 * Date: Jan 13, 2023
 * Section 16: Basic Input & Output including java.util
 * Topic: Exceptions
 */

public class Exceptions {
    public static void main (String[] args) {
        //int x = 98;
        //int y = 0;
        //
        //System.out.println(divideLBYL(x, y));
        //System.out.println(divideEAFP(x, y));

        //int x = getInt();
        //int x = getIntLBYL();

        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;

        System.out.print("Please enter an integer: ");
        String input = s.next();

        for (int i=0; i<input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }

            if (isValid) {
                return Integer.parseInt(input);
            }
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
