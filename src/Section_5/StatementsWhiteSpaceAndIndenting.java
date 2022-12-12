package Section_5;

public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        // this is a statement
        // the semicolon is necessary
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
