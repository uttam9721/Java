// package Basic;

// public class typecasting {
//     public static void main(String[] args) {
//         int a=10;
//         long b=a;
//         System.out.println(b);
//     }
    
// }
// byte->short -> int ->float ->long ->double
// the above mention data convert automatically; 

// package Basic;

// import java.util.Scanner;

// /**
//  * typecasting
//  */
// public class typecasting {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float num = sc.nextInt();
//         System.out.println(num);
//     }
// }

package Basic;

import java.util.Scanner;

/**
 * typecasting
 */
public class typecasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b=(int)a;
        System.out.println(b);
    }
}