package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersinanArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int[] result = optimal(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] leader(int[] arr){ // leader means element is higher than the all elements present in right side of that element
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            boolean flag = true;
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] < arr[j]){
                    flag = false;
                }
            }
            if(flag){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
    public static int[] optimal(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length-1;i++){
            int[] subarray = Arrays.copyOfRange(arr,i+1,arr.length);
            System.out.println(Arrays.toString(subarray));
            Arrays.sort(subarray);
            if(arr[i] > subarray[subarray.length-1]){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
}
