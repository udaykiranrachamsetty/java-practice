package arrays;

import java.util.HashMap;
import java.util.Map;

public class findnumberthatappearsonce {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int ans = findnumber(arr);
        System.out.println(ans);
    }


    public static int findnumber(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(int i = 0 ; i < arr.length;i++){
            if(map.get(arr[i]) == 1){
                ans = arr[i];
            }
        }
        return ans;
    }
}
