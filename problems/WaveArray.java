import java.util.*;
class WaveArray{

public static void main(String[] args) {
    int arr[] =  {1,2,3,4};
    wavesort(arr);

    for(int j=0; j<arr.length; j++){
        System.out.println(arr[j]);
    }
}
public static void wavesort(int arr[]){

    Arrays.sort(arr);
    int length = arr.length;
    int temp;

    for(int i=0; i<length-1; i=i+2){
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

}

}