package inheritance;

import java.util.*;

public class Main {
     public static void main(String[] args) {
        String[] s = {"abc","bcd","aaaa","cbc"};
        char c = 'a';
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0 ; i < s.length;i++ ){
            StringBuilder b = new StringBuilder(s[i]);
            if(b.indexOf(String.valueOf(c)) != -1){
                a.add(i);
            }
        }
         System.out.println(Arrays.toString(a.toArray()));
     }

}
