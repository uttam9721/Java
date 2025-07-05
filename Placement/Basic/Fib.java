// import java.util.*;
// public class Fib {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number.");
//         int n=sc.nextInt();
//         int a = 0;
//         int b = 1;
//         for(int i =0;i<n;i++){
//             System.out.print(a+" ");
//             int c = a+b;
//             a=b;
//             b=c;
//         }
//     }
    
// }

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        while (n>0) {
            int rev = n%10;
            n = n/10;
            System.out.print(rev);         
        }
    }

}