package Recursion;

public class SumofNo {
    static int sum(int n){
        // base case
        if(n>=0 && n<=9 ){
            return n;
        }
        // int smallAns=sum(n/10);
        // int ans=smallAns+n%10;
        // return ans;
        return sum(n/10)+n%10;

    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
    
}
