package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int num = 17;
        int[] index = twosum(arr,num);
        System.out.println(Arrays.toString(index));
    }
    public static int[] twosum(int[] arr , int sum){
        ArrayList<Integer> search = new ArrayList<>();
        int[] index = new int[2];
        for(int i = 0 ; i < arr.length;i++){
            search.add(arr[i]);
        }
        for(int i = 0 ; i < arr.length;i++){
            int c = sum - arr[i];
            if(search.contains(c)){
                index[0] = i ;
                index[1] = search.indexOf(c);
                break;
            }
        }
        return index;
    }
}
