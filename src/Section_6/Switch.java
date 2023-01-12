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
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
