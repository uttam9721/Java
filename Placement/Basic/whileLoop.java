import java.util.*;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number n:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
