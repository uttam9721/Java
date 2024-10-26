public class count {
    public static void main(String[] args) {
        int n=123456;
        int count=0;
        // int original=n;
        // int sum=0;
        while(n>0){
            n=n/10;
            count++;
        }
        // sum=sum+num;
        System.out.println(count);
    }
    
}
