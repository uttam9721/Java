import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num%5==0) {
            System.out.println("Number is divided by 5");
        }else{
            System.out.println("Number is not divided by 5");
       
        }
    }
    
}
