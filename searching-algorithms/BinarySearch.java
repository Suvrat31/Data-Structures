// searches in a Sorted Array, Hence Sort the array first before implementing. Using Recursive Binary Search...
import java.io.*;
import java.lang.*;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int value;
        int[] arr = new int[10];
        int arrlen = arr.length;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an array of 10 numbers to be sorted using binary search :");
    //user input for array values
        for(int i=0; i<10; i++){
        value = scanner.nextInt();
        arr[i] = value;
    }
    System.out.println("Enter the value to be searched :");
    int searchVal = scanner.nextInt();
    //sending the array to a searching func
    int valueAt = search(arr , 0,arrlen-1 ,searchVal);
   
    System.out.println("The value you are searching for is at " + (valueAt+1) +" position" );
    }
    private static int search(int arr[],int left, int right,  int searchVal) {
          
        if(right>=1){
            int middle = left +(right -left) / 2 ;
            
            if(arr[middle] == searchVal)
            {return middle;}

            if(arr[middle]> searchVal){
                return search(arr, left, middle-1, searchVal);
            }
            
               
            return search(arr, middle+1, right, searchVal);
            
        }
        
        return -1;
    }

}