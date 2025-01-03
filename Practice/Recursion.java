// package Practice;

public class Recursion {
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        return n*(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        fact(n);
    }
}