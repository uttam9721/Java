package Recursion;

public class Basic { 
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;

        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void OneToFive(int n){
        if(n==6){
            return;
        }
        System.out.print(n);
        OneToFive(n+1);
        
    }
    public static void printSum(int sum,int n ,int i){
        if (i==n) {
            sum+=i;
            System.out.print(sum);
            return; //
            
        }
        sum+=i;
        printSum(i+1,n,sum);

    } 
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
            
        }return isSorted(arr, i+1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = (n-1);
        int fn = n*fact(n-1);
        return fn;

    }
    public static int SumofN(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = SumofN(n-1);
        int Sn= n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        // int n =10;  // for other functions 
        // int n = 1; //for OneToFive
        // printSum(1, 5, 0);
        // int arr[] = {1,2,3,4};
        // System.out.println(isSorted(arr, 0));
        // printDec(n);
        // printInc(n);
        // OneToFive(n);
        int n =5;
        // System.out.println(fact(n));
        System.out.println(SumofN(n));
    }
    
}
