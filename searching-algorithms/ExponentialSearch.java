import java.io.*;
import java.lang.*;
import java.util.*;

public class ExponentialSearch {
    public static void main(String[] args) {
        int value;
        int[] arr = new int[10];
        int arrlen = arr.length;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an array of 10 numbers to be sorted using exponential search :");
    //user input for array values
        for(int i=0; i<10; i++){
        value = scanner.nextInt();
        arr[i] = value;
    }
    System.out.println("Enter the value to be searched :");
    int searchVal = scanner.nextInt();
    //sending the array to a searching func
    int valueAt = exponentialSearch(arr ,arrlen,searchVal);   
    System.out.println("The value you are searching for is at " + (valueAt+1) +" position" );
    
    }

    private static int exponentialSearch(int array[], int n, int searchValue){

        if(array[0]==searchValue)
        return 0;

        int a = 1;
        while(a<n && array[a] <= searchValue){
            a=a*2;

        }
        return binarySearch(array, (a/2), Math.min(a,n), searchValue);

    };
    private static int binarySearch(int arr[],int left, int right,  int searchVal) {
          
        if(right>=1){
            int middle = left +(right -left) / 2 ;
            
            if(arr[middle] == searchVal)
            {return middle;}

            if(arr[middle]> searchVal){
                return binarySearch(arr, left, middle-1, searchVal);
            }
            
               
            return binarySearch(arr, middle+1, right, searchVal);
            
        }
        
        return -1;
    }

}
