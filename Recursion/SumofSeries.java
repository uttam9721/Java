package Recursion;

import java.util.Scanner;

public class SumofSeries {
    static int seriesCount(int n){
        if (n==0) {
            return 0;  
        }
        return seriesCount(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n=:");
        int n = sc.nextInt();
        System.out.println(seriesCount(n));

    }
    
}
