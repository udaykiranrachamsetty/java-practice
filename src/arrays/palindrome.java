package arrays;

public class palindrome {
    public static void main(String[] args) {
        Integer number = 1230321;
        String num = number + "";
        int length = num.length();
        int i = 0;
        int j = length-1;
        boolean flag = true;
        while(i <= j){
            if(num.charAt(i) != num.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
