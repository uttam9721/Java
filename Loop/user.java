package Loop;

import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int count = sc.nextInt();
        int i = 1;

        while (i<=count) {
            System.out.print(i + " ");
            i++;
            
        }
    }
    
}
