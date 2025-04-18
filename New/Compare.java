import java.util.*;

public class Compare {
    public static int CountNumber(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++; 
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int arr[]={1,1,2,2,2,3,3,6,7};
        System.out.println(CountNumber(arr, x));
        
    }
    
}
