package Section_9;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        System.out.println(Arrays.toString(numArr));
        System.out.println(numArr.length);

        int[] secArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(secArr));

        int[] copySecArr = Arrays.copyOf(secArr, secArr.length);
        System.out.println(Arrays.toString(copySecArr));

        String[] marineLife = {"Shark", "Dolphin", "Octopus", "Squid", "Jelly-Fish"};
        Arrays.sort(marineLife);
        System.out.println(Arrays.toString(marineLife));

        if (Arrays.binarySearch(marineLife, "Octopus") >= 0) {
            System.out.println("Found Octopus in the list!");
        } else {
            System.out.println("Element not found!");
        }

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 6};

        if (Arrays.equals(a1, a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are NOT equal");
        }
    }
}
