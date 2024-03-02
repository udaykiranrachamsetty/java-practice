package string;

import java.util.Scanner;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String ans = longestpalindromesubstring(s);
        System.out.println(ans);
    }
    // brute force - tc : o(n^3)
    public static String longestpalindromesubstring(String s){
        int max = 0 ;
        String ans = "";
        for(int i = 0 ; i < s.length();i++){
            for(int j = i ; j < s.length();j++){
                if(palindrome(s.substring(i,j+1)) && j-i+1 > max){
                    ans = s.substring(i,j+1);
                    max = j-i+1;
                }
            }
        }
        return ans;
    }
    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        return flag;
    }
}
