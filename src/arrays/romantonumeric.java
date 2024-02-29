package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class romantonumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int number = convert(s);
        System.out.println(number);
    }

    public static int convert(String s){
        HashMap<Character,Integer> h = new HashMap<>();
        int number = 0 ;
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        for(int i = 0 ; i < s.length();i++){
            if( i < s.length()-1 && h.get(s.charAt(i))  < h.get(s.charAt(i+1))){
                number = number - h.get(s.charAt(i));
            }
            else{
                number = number + h.get(s.charAt(i));
            }
        }
        return number;
    }
}
