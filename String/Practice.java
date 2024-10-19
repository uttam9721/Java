import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
//         String str = "Uttam maurya";
//         // System.out.println(str.contains("ttam"));
//         // System.out.println(str.startsWith("Utt"));
//         // System.out.println(str.endsWith("ya"));
//         // System.out.println(str.toUpperCase());
//         System.out.println(str.toLowerCase());
//     }
    
// }



/**
 * Practice
 */
// public class Practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder str = new StringBuilder(sc.nextLine());
        
//     }
// }

/**
 * Practice
 */
// public class Palindrome {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 System.out.println("The string is not a palindrome");
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "uttam";
//         System.out.println(isPalindrome(str)); // Output will be true
//     }
// }

/**
 * Practice
 */
public class Practice {
    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "uttam";
        System.out.println(isPalindrome(str));
    }
}