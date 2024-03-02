package string;

import java.util.ArrayList;
import java.util.Arrays;

public class palindromedecompositions {
    public static void main(String[] args) {
        String s = "abcbaab";
        ArrayList<String> decompositions = bruteforce(s);
        System.out.println(decompositions);

    }
    public static ArrayList<String> bruteforce(String s){
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                String substring = s.substring(i,j+1);
                if(palindrome(substring) && a.indexOf(substring) == -1){
                    a.add(substring);
                }
            }
        }
        return a;
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
