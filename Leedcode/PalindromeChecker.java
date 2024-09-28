import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        if (number<0) {
            return false;
        }
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int number = sc.nextInt();
      System.out.print(isPalindrome(number));
    }
}
