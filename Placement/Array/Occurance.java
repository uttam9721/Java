import java.util.*;
public class Occurance {
   static int Repeating(int arr[],int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++;
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of An Array");
        int n = sc.nextInt();
        System.out.println("Enter the value of x");
        int x =sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Repeating(arr, x));
    }
    
    
}
