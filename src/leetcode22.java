public class leetcode22 {
    public static void main(String[] args) {
        String s = "011101";
        int max = 0 ;
        for(int i = 0 ; i < s.length();i++){
            for(int j = i+1;j<s.length();j++){
                String left = s.substring(i,j);
                String right = s.substring(j);
                int l = count0s(left);
                int r = count1s(right);
                if(l+r > max){
                    max = l+r;
                }
            }
        }
        System.out.println(max);
    }
    public static int count0s(String s){
        int count = 0 ;
        char[] chars = s.toCharArray();
        for(char i : chars){
            if(i == '0'){
                count++;
            }
        }
        return count;
    }

    public static int count1s(String s){
        int count = 0 ;
        char[] chars = s.toCharArray();
        for(char i : chars){
            if(i == '1'){
                count++;
            }
        }
        return count;
    }
}
