// import java.util.*;

// class Nested {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 3; j++) {
//                 System.out.print(i + "," + j + " ");
//                 // You could also use: System.out.print(i + "+" + j + " ");
//             }
//             System.out.println(); // To move to the next line after each inner loop
//         }
//     }
// }


// pattern
// package New;

// import java.util.Scanner;

// public class Nested {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ulta star
// package New;

// import java.util.Scanner;

// public class Nested {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number ");
//         int r = sc.nextInt();
//         for(int i = 1;i<=r;i++){
//             for(int j =1;j<=(r+1-i);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// 


package New;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
            // System.out.println();
        }
    }
}