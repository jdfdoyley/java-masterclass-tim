package Section_16;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Author: Jason D'Oyley
 * Date: Jan 13, 2023
 * Section 16: Basic Input & Output including java.util
 * Topic: Stack Trace and Call Stack
 */
public class StackTraceCallStack {
    public static void main (String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Attempting to divide by zero");
        }
    }

    private static int divide() {
        int x;
        int y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + " y is " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        while (true){
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.print("Please enter a number using only the digits 0 to 9: ");
            }
        }
    }
}
