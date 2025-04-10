import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            ans=ans+n%10;
            n=n/10;

        }
        System.out.println(ans);
    }
    
}
