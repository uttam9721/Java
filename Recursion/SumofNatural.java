package Recursion;
import java.util.*;

// package Recursion;

/**
 * Basic
 */
public class SumofNatural {
    static void printInc(int n){
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // resursive work ;
        printInc(n-1);  // 1,2,3,.....n-1, n assume 

        // self work
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        printInc(n);
    }
}