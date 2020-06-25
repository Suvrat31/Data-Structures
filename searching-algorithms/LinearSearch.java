import java.io.*;
import java.lang.*;
import java.util.*;

class LinearSearch{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Enter an array of 10 numbers to be sorted using linear search :");
    //user input for array values
        for(int i=0; i<10; i++){
        value = scanner.nextInt();
        arr[i] = value;
    }
    System.out.println("Enter the value to be searched :");
    int searchVal = scanner.nextInt();
    //sending the array to a searching func
    int valueAt = search(arr ,searchVal);
   
    System.out.println("The value you are searching for is at " + (valueAt+1) +" position" );
    }

    private static int search(int arr[], int searchVal) {
        int arrlen = arr.length; 
        for(int z=0; z<arrlen; z++){
            if(arr[z]==searchVal){
                return z;
            }
        }return 0;
    }
}
