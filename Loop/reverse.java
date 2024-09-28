package Loop;

public class reverse {
    public static void main(String[] args) {
        int n = 10899;
        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n= n/10;
        }
        System.out.println();
    }
    
}
