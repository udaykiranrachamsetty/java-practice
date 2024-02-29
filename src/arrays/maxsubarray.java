package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = {-1,4,-6,8};
        int max = maxsum(arr);
        System.out.println(max);
        int max1 = optimizemaxsum(arr);
        System.out.println(max1);
        int max2 = optimizetcmaxsum(arr);
        System.out.println(max2);
        int max3 = optimizeTCmaxsum(arr);
        System.out.println(max3);
    }

    public static int maxsum(int[] arr){ //brute force tc = 0(n^3) sc = 0(t) t = a.size()
        int n = arr.length;
        ArrayList<Integer> a= new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = i; j < n ; j++){
                int sum = 0 ;
                for(int k = i ; k <= j ;k++){
                    sum = sum + arr[k];
                }
                a.add(sum);
            }
        }
        Collections.sort(a);
        return a.get(a.size()-1);
    }

    public static int optimizemaxsum(int[] arr){ //brute force tc = 0(n^3) sc = 0(1)
        int n = arr.length;
        int max = arr[0];
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int sum = 0 ;
                for(int k = i ; k <= j ;k++){
                    sum = sum + arr[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int optimizetcmaxsum(int[] arr){ //brute force tc = 0(n^2) sc = 0(1)
        int n = arr.length;
        int max = arr[0];
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ;
            for(int j = i ; j < n ; j++){
                sum = sum + arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int optimizeTCmaxsum(int[] arr){ //brute force tc = 0(n) sc = 0(1)
        // here we don't know what sub array . but we know that the sum is greater
        int n = arr.length;
        int currsum = arr[0];
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            currsum = Math.max(arr[i], currsum + arr[i]); // we are checking whether should we continue the prev sub array sum or the element alone is greater than the previous sum to start a new sub array
            if(currsum > max){
                max = currsum; // checking which is max
            }
        }
        return max;
    }


}
