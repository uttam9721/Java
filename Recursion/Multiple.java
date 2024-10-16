package Recursion;


import java.util.Scanner;
public class Multiple {
   static void printMul(int n , int k){
     // base case;
     if(k==1){
        System.out.print(n+" ");
        return;
    }
    // recursive case;
    printMul(n, k-1);
    // self work
    System.out.print(n*k + " ");
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        printMul(n, k);
        
    }
    
}
