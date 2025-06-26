import java.util.Scanner;

public class p {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // int n = 10;
        if (n%5==0 && n%3==0) {
            System.out.println("Geeta weds sanju");
        }else if (n%3==0) {
            System.out.println("sanju");  
        }else if (n%5==0) {
            System.out.println("geeta");
        }else{
            System.out.println("Breakup");
        }
    }
}