package arrays;

import java.util.Arrays;

public class LeftRotatebykthposition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2 ;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - k);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse(int[] arr , int start , int end){
        int i = start;
        int j = end;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
