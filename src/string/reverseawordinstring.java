package string;

public class reverseawordinstring {
    public static void main(String[] args) {
        String s = "this is an amazing program";
        String reverse = reverse(s);
        System.out.println(reverse);
    }
    public static String reverse(String s){
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1;i >= 0 ; i--){
            ans.append(arr[i]).append(" ");
        }

        return ans.toString();
    }
}
