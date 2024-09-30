package Leedcode;

public class fibonacci509 {
    public static int isFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
        
        for (int i = 2; i <= n; i++) {
            thirdTerm = firstTerm + secondTerm;  // Fibonacci: sum of the previous two terms
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return thirdTerm;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(4));  // Output should be 3
    }
}
