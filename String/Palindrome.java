/**
 * Palindrome
 */
public class Palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("The string is not a palindrome");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "uttam";
        System.out.println(isPalindrome(str)); // Output will be true
    }
}
