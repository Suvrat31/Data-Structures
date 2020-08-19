import java.util.*;

class MedianMatrix{
    public static void main(String[] args) {
        int matrix[][] = { {1,3,5}, {2,6,9}, {3,6,9}};
        int n = matrix.length; //number of rows
        int m = matrix[0].length;//number of columns
        int finalMedian =  findMedian(matrix, n, m);
        System.out.println("The Median is : " + finalMedian);
    }


    public static int findMedian(int matrix[][], int n, int m){
        
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;

        //iterating through all the rows to find the min and max element to start binary search 
        for(int i=0; i<n; i++){

            if(matrix[i][0] < min)
                min = matrix[i][0];

            if(matrix[i][m-1] >max)
                max = matrix[i][m-1];
        }

        int idealMedian = (n*m+1)/2;

        while(min<max){
            int mid = min + (max-min) / 2;
            int place = 0; // number of elements smaller than mid
            int nSmaller = 0; // to find number of elements smaller than mid in the particular row that we are searching
            
            for(int i=0; i<n; i++){
                nSmaller = Arrays.binarySearch(matrix[i],mid);

                //if the mid element isnt found then this function returns the value at where the mid element should have been
                //This means by knowing that place we can know all the elements that were lesser than it in that row
                if(nSmaller<0)
                    nSmaller= Math.abs(nSmaller) - 1;
                
                //if the element is found the index is returned for that element, Consider that it might be a duplicate
                //So we go to the last index of the element which will give the number of elements smaller than number including the number we searched
                else
                {
                    while(nSmaller < matrix[i].length && matrix[i][nSmaller] == mid)
                    nSmaller = nSmaller + 1;
                }

                place = place + nSmaller;
            }

                if(place<idealMedian)
                    min = mid+1;
                else
                    max = mid;


            
            
        }
        return min;
     }
}