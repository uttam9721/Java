package Recursion;
import java.util.*;
public class Fact{
    static int factorial(int n){
        // base case
        if (n==0) {
            return 1; 
        }
        // smaller problem
        // int smallerAns = factorial(n-1);  //factorial(4);
        // self work
        // int ans = n*smallerAns;  // n*factorial(n-1);
        // return ans;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
    
}
