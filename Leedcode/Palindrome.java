package Leedcode;

/**
 * Palindrome
 */
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int n = x;
        if(n<0){
            return false;
        }
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
            }
            return x == rev;
            
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321)); // true
        
        
    }
}