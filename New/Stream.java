import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0) {
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
    }
    
}
