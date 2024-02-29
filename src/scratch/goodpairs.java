package scratch;
import java.util.*;
public class goodpairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int sum = 0 ;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int n = entry.getValue();
            if(n > 1){
                sum = sum + (n*(n-1)/2);
            }
        }
        System.out.println(sum);
    }

}
