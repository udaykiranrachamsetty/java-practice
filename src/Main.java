import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] arr = {7,1,2,5,8,3,0,12,43,46,9};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        String[] a = {"abc","bc"};
        String s = String.join("",a);
        for(String i : a) continue;

    }
    public static int[] insertionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            int j = i + 1 ;
            while ( j > 0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j = j-1;
                }
                else break;
            }
        }
        return arr;
    }

    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            for(int j = 0; j < n-i-1 ; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            int max = 0;
            for(int j = 0; j <= n-i-1 ; j++){
                if(arr[j] >= arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[n-i-1] ;
            arr[n-i-1] = temp;
        }
        return arr;
    }
}