package Section_6;

/**
 * Author: Jason D'Oyley
 * Date: Jan 12, 2023
 * Track: R1D12
 * Topic: The switch Statement
 */
public class Switch {
    public static void main(String[] args) {
        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}
