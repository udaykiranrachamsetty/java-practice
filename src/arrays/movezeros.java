package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class movezeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        arr = optimal(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] zeroestoend(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : arr) {
            arrayList.add(value);
        }
        int i = 0 ;
        int j = arr.length-1;
        int temp = 0;
        while(i < j){
            if(arrayList.get(j) != 0){
                j--;
            }
            if(arrayList.get(i) == 0 ){
                temp = arrayList.remove(i);
                arrayList.add(temp);
                j--;
            }
            if(arrayList.get(i) != 0){
                i++;
            }
            System.out.println("i " + i);
            System.out.println("j " + j);
        }
        arr = arrayList.stream().mapToInt(k -> k).toArray();
        return arr;
    }

    //brute force with first collecting non zero numbers and storing

    public static int[] zerosToend(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] != 0){
                arrayList.add(arr[i]);
            }
        }
        for(int i = arrayList.size(); i < arr.length;i++){
            arrayList.add(0);
        }
        arr = arrayList.stream().mapToInt(k -> k).toArray();
        return arr;
    }

    public static int[] optimal(int[] arr){ // o(1) sc
        // finding out first zero index
        int j = -1;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // staring from the next to first zero index iterating through the array and if non zero element found swaping with the zero element and increment the j
        for(int i = j+1 ; i < arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
