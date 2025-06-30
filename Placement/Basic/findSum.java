import java.util.*;
public class findSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sumofDigits=0;
        while (n>0) {
            sumofDigits=sumofDigits+n%10;
            n=n/10;
            
        }
        System.out.println(sumofDigits);

        
    }
    
}
