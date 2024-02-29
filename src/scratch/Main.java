package scratch;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = "ababcdefghi";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            Character c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        System.out.println(map.get('a'));
    }
}
