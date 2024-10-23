public class charAt {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        // System.out.println(str.charAt(1));
        printletter(str);
        }
}

/**
 * charAt
 */
// public class charAt {
//   static  boolean isPalindrome(String str){
//         for (int i = 0; i < str.length()/2; i++) {
//             if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
//                 return false;
                
//             }
            
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "uttam";
        
//         System.out.println(isPalindrome(str));
//     }
// }