import java.util.*;
public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of P");
        float p = sc.nextFloat();
        System.out.println("Enter value of R");
        float r = sc.nextFloat();
        System.out.println("Enter value of T");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println(si);

    }
}
