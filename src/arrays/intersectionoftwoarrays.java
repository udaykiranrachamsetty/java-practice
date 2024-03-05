package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class intersectionoftwoarrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        int[] common = Common(arr1,arr2);
        System.out.println(Arrays.toString(common));
    }
    public static int[] common(int[] arr1 , int[] arr2){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();
        for(int i = 0 ; i < arr1.length;i++){
            l1.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length;i++){
            l2.add(arr2[i]);
        }
        for(int i = 0 ; i < l1.size();i++){
            if(l2.contains(l1.get(i))){
                common.add(l1.get(i));
            }
        }
        return common.stream().mapToInt(k -> k).toArray();

    }
    public static int[] Common(int[] arr1, int[] arr2){
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int j : arr2) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue() >1){
                l.add(i.getKey());
            }
        }
        return l.stream().mapToInt(k -> k).toArray();
    }
}
