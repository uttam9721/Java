public class sumofdigit {
    public static void main(String[] args) {
        int n=1234567;
        // int count=0;
        int sum=0;
        while (n>0) {
            // n=n%10;
            sum=sum+n%10;
            n=n/10;
            // count++;
            
        }
        System.out.println(sum);
    }
    
}
