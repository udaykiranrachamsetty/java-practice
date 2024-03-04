package arrays;

import java.util.ArrayList;

public class missingelement {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int n = 3;
        int ans = optimized(arr,n);
        System.out.println(ans);
    }
    public static int bruteforce(int[] arr , int n){
        ArrayList<Integer> x = new ArrayList<>();
        int ans = -1;
        for(int i = 1 ; i <= n ; i++){
            x.add(i);
        }
        ArrayList<Integer> existing = new ArrayList<>();
        for(int i : arr){
            existing.add(i);
        }
        for(int i : x){
            if(!existing.contains(i)){
                ans = i;
            }
        }
        return ans;
    }
    public static int optimized(int[] arr , int n){
        int ans = -1;
        for(int i = 0 ; i < n-1;i++){
            if(arr[i] != i+1){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}
