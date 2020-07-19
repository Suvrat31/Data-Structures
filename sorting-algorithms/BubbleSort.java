import java.io.*;
import java.lang.*;
import java.util.*;

class BubbleSort{

    public static void main(String[] args) {
        int value;
        int[] arr = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an array of 10 numbers to be sorted using bubble sort :");
    //user input for array values
        for(int i=0; i<10; i++){
        value = scanner.nextInt();
        arr[i] = value;
    }
    
    //sending the array to a sorting func
    sort(arr  ,arr.length);
    scanner.close();
    }


    private static int sort(int arr[], int length){

        for(int i=0; i<length - 1; i++){
            for(int j=0; j<length-i-1; j++){
                if(arr[j]> arr[j+1]){

                    //swap the numbers 
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr, length);

        return 0;
    }

    private static int printArray(int arr[], int length){
        System.out.println("The sorted array is :");
        for(int x = 0; x<length; x++){
        System.out.println(arr[x] + " ");
        }
        return 0;
    }
}