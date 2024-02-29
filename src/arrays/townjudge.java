package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class townjudge {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3}};
        int i = determinejudge(arr,3);
        System.out.println(i);
    }
    public static int determinejudge(int[][] trust,int n){
        int[] trusting = new int[n + 1];
        int[] trusted = new int[n + 1];

        for (int[] ints : trust) {
            trusting[ints[0]]++;
            trusted[ints[1]]++;
        }

        int ans = -1;

        for (int i = 1; i <= n; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1)
                ans = i;
        }

        return ans;
    }

}
