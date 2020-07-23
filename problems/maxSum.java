//This algo is based on Kadane's Algorithm to find the largest sum contiguous Subarray. This will not work in case of all negative numbers in the array
public class maxSum {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = maxSubArraySum(arr, arr.length);
        System.out.println("The max sum from the contiguous subarray is "+ maxSum);
    }

    static int maxSubArraySum(int a[],int size)  
{  
    //Init maximum so far and maximum sum ending here to 0  
    int max_so_far = 0, max_ending_here = 0;  
  
    for (int i = 0; i < size; i++)  
    {  
        //Add each array element to max ending here variable
        max_ending_here = max_ending_here + a[i]; 
        
        //if this var turns out to be less then zero then reset it to zero
        if (max_ending_here < 0)  
            max_ending_here = 0;  
        //if the maximum sum so far has been less than maximum sum ending at the particular element of the array then update. 
        else if (max_so_far < max_ending_here)  
            max_so_far = max_ending_here;  
          
    }  
    return max_so_far;  
}
}
