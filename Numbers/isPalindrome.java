public class isPalindrome {
    public static boolean Palindrome(int x) {
        int temp = x;
        int rev = 0;
        while(x>0){
            rev = rev*10 + x%10;
            x = x/10;
        }  
        return temp == rev ;
    }

    public static void main(String args[]){
        System.out.println(Palindrome(121));
    }
}
