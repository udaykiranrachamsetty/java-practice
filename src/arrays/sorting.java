package arrays;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,6,0};
        ascendingordescending(arr);
    }
    public static void ascendingordescending(int[] arr){
        boolean asc = true;
        boolean desc = true;
        for(int i = 0 ; i < arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                desc = false;
            }
            else if(arr[i] > arr[i+1]){
                asc = false;
            }
        }
        System.out.println(asc || desc);

    }

}
