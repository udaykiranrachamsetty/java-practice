package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int ans = optimal(arr);
        System.out.println(ans);
    }

    // simple solution , before sorting we need to check whether there are any duplicates or not then we can proceed with find 2nd largest element.
    public static int secondLargestElement(int[] arr){ // tc = o(n) and sc = o(n)
        if(arr.length < 2){
            return -1;
        }
        // consider if there are any duplicates?
        ArrayList<Integer> x = new ArrayList<>();
        for (int j : arr) {
            if (!x.contains(j)) {
                x.add(j);
            }
        }
        arr = x.stream().mapToInt(k -> k).toArray();
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // reduce space complexity
    public static int optimal(int[] arr){ // tc = o(n) , sc = o(1)
        if(arr.length < 2){
            return -1;
        }
        int largest = 0 ;
        int secondlargest = 0 ;
        for (int j : arr) {
            if (j > largest) {
                secondlargest = largest;
                largest = j;
            } else if (j > secondlargest && j != largest) {
                secondlargest = j;
            }
        }
        return secondlargest;
    }
}
