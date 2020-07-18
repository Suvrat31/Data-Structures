import java.io.*;
import java.lang.*;
import java.util.*;

class SelectionSort{

    public static void main(String[] args) {
        int value;
        int[] arr = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an array of 10 numbers to be sorted using selection sort :");
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
            int smallest = i;
            //traverse the whole array to find the smallest element
            for(int j = i+1; j < length; j++ ){
                if(arr[j]<arr[smallest])
                smallest = j;
            }
            //swap 
            int k = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = k; 
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