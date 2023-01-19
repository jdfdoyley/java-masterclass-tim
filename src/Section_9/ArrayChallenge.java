package Section_9;


import java.util.Arrays;
import java.util.Random;

/**
 * Array Challenge Exercise
 * Create a program using arrays, that sorts a list of integers, in descending order. Descending
 * order means from highest to lowest.
 *
 * In other words, if the array has the values 50, 25, 80, 5 and 15, your program should return an
 * array with the values in descending order: 80, 50, 25, 15, and 5.
 *
 * First, create an array of randomly generated  integers.
 * Then, print the array before you sort it.
 * Then, print the array after you sort it.
 * You can choose to create a new sorted array, or just sort the current array.
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        int[] numbers = getRandomArray(10);

        // print array before it is sorted
        System.out.println(Arrays.toString(numbers));

        // print sorted numbers array in descending order
        int[] sortedNumbers = sortInDescendingOrder(numbers);
        // print array after array is sorted
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static int[] getRandomArray(int length) {
        // generate a list of random numbers between 1 and 100
        // store a list of 10 generated numbers in the numbers array
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            Random randInt = new Random();
            randomArray[i] = randInt.nextInt(1, 101);
        }
        return randomArray;
    }

    public static int[] sortInDescendingOrder(int[] array) {
        int len = array.length;
        int[] sortedArray = Arrays.copyOf(array, len);
        int[] sortedNumbers = new int[len];

        // sort array in ascending order
        Arrays.sort(sortedArray);

        // sort array in descending order
        for (int i = (len - 1), j = 0; i >= 0; i--, j++) {
            sortedNumbers[j] = sortedArray[i];
        }
        return sortedNumbers;
    }
}
