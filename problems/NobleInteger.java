class NobleInteger{
public static void main(String[] args) {
    int arr[] = {1,1,3,3};
    int n = arr.length;
   int result =  calculate(arr, n);
   System.out.println(result);
}

static int calculate(int arr[], int n){
    
    for(int i=0; i<n; i++){
        int count = 0;
        for(int j = 0; j<n; j++){
            if(arr[i]<arr[j])
                {count++;}
        }    
            if(count == arr[i])
            {return 1;}
        
    }
    return -1;
}

}