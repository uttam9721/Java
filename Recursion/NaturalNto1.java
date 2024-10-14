package Recursion;

import java.util.Scanner;

public class NaturalNto1 {
    static void NaturalNtoOne(int n){  // 5 4 3 2 1;
        // this is base case ;
        if (n == 1) {
            System.out.println(n);
            return;   
        }
        // self work ;
        System.out.print(n +" ");   // (10);
        // resursive work ;
        NaturalNtoOne(n-1);  // n-1 ,n-2,n-3 .... like(9,8,7,6,5,4,3,2,1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        NaturalNtoOne(n);   
    }
    
}
