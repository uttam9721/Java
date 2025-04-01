import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is even  "+num);
        }else{
            System.out.println("Number is odd  "+num);
        }
    }
    
}
