public class OperatorPrecedenceChallenge {
    public static void main(String[] args) {
        // Create a double variable with a value of 20.00
        double dblValue1 = 20.0d;

        // Create a second variable of type double with a value 80.00
        double dblValue2 = 80.0d;

        // Add both numbers together, then multiply by 100.00
        double result = (dblValue1 + dblValue2) * 100.0d;

        // Use the remainder operator, to figure our what the remainder
        // from the result of the operation is step3, and 40.00, will be
        double remainder = result % 40.0d;
        System.out.println("Remainder: " + remainder);

        // Create a boolean variable that assigns the value true, if the
        // remainder in step four is 0.00, or false if it's not zero
        boolean isZero = remainder == 0.0d;

        // Output the boolean variable just to see what the result is.
        System.out.println("No Remainder: " + isZero);

        // Write an if-then statement that displays a message, 'got some
        // remainder', if the boolean in step 5 is not true
        if (!isZero)
            System.out.println("Got some remainder");
    }
}
