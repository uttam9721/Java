package Recursion;

public class Fibonacci {
    static int fib(int n){
        // base case ;
        if(n==0 || n==1){
            return n;
        }
        // sub problems
        // int prev = fib(n-1);
        // int prev2 = fib(n-2);


        // int ans = prev2+prev;
        // return ans;
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        int n=6 ;
        System.out.print(fib(n));

        
    }
    
}
