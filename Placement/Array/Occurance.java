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
    static int lastOccurance(int arr[],int x){
        int lastIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    static boolean isSorted(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false; // Not sorted
        }
    }
    return true; // Sorted
}

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of An Array");
        int n = sc.nextInt();
        // System.out.println("Enter the value of x");
        // int x =sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // System.out.println(Repeating(arr, x));
        // System.out.println(lastOccurance(arr, x));
        System.out.println(isSorted(arr));
    }
    
    
}
