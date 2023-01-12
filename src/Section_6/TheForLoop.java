package Section_6;

/**
 * Author: Jason D'Oyley
 * Date: Jan 12, 2023
 * Track: R1D12
 * Topic: The for Statement
 */

public class TheForLoop {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        System.out.println();   // New line

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmt = calculateInterest(10000.0, rate);
            System.out.println("$10,000 at " + rate + "% interest = $" + interestAmt);
        }
        System.out.println();   // New line

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmt = calculateInterest(100.0, rate);
            System.out.println("$100 at " + rate + "% interest = $" + interestAmt);
        }
        System.out.println();   // New line

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmt = calculateInterest(100.0, rate);

            if (rate == 8.5) break;

            System.out.println("$100 at " + rate + "% interest = $" + interestAmt);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
