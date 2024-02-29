package arrays;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {6,3,1,7,5,2};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] reverse(int[] arr){
        int i = 0 ;
        int j = arr.length-1;
        while(i < j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        return arr;
    }
}
