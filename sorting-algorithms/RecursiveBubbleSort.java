
import java.io.*;
import java.lang.*;
import java.util.*;

class RecursiveBubbleSort{

    public static void main(final String[] args) {
        int value;
        final int[] arr = new int[10];

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array of 10 numbers to be sorted using bubble sort :");
        // user input for array values
        for (int i = 0; i < 10; i++) {
            value = scanner.nextInt();
            arr[i] = value;
        }

        // sending the array to a sorting func
        sort(arr, arr.length);
        scanner.close();
    }

    private static void sort(final int arr[], final int length) {

        for (int i = 0; i < length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                // swap the numbers
                final int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }

        }
        sort(arr, length - 1);
        printArray(arr, length);

    }

    private static int printArray(final int arr[], final int length) {
        System.out.println("The sorted array is :");
        for(int x = 0; x<length; x++){
        System.out.println(arr[x] + " ");
        }
        return 0;
    }
}