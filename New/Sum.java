import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number pls");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num<=n){
            sum=sum+num;
            num++;
        }
        System.out.print(sum);
    }
}