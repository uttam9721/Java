import java.util.*;
public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // int temp = n;
        int counter = 0;
        while (n!=0) {
            n=n/10;
            counter++;
        }
        System.out.println("Number of digits"+" :"+counter);
    }
    
}
