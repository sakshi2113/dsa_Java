package Basic;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if(temp == rev){
            return true ;
        }
        return false;
    }

    public static void main(String[] args) {
        int x=12321;
        System.out.println(isPalindrome(x));
    }
}
