//Jump search uses the jump size that is sqrt(array length) and does a linear search between the range where the value to be searched might lie.
import java.io.*;
import java.lang.*;
import java.util.*;

public class JumpSearch {
    public static void main(String[] args) {
        int value;
        int[] arr = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sorted array of 10 numbers to be searched using jump search :");
    //user input for array values
        for(int i=0; i<10; i++){
        value = scanner.nextInt();
        arr[i] = value;
    }
    System.out.println("Enter the value to be searched :");
    int searchVal = scanner.nextInt();
    //sending the array to a searching func
    int valueAt = search(arr  ,searchVal);
    scanner.close();
    System.out.println("The value you are searching for is at " + (valueAt+1) +" position" );
    }
   
   
    private static int search(int arr[],  int searchVal) {
        //length of the array
        int value = 0;
        int arrlen = arr.length;

        //size to be jumped during traversal 
        int jumpSize = (int)Math.floor(Math.sqrt(arrlen));

        while (arr[jumpSize] <= searchVal && jumpSize < arrlen) {
            value = jumpSize;
            jumpSize = jumpSize + (int)Math.floor(Math.sqrt(arrlen));

            if(jumpSize > arrlen -1)
            return -1;
        }

        //performing linear search
        for(int a =value; a<jumpSize; a++){
            if(arr[a]==searchVal)
                return a;
        }
       
        return 0;
    }

}
