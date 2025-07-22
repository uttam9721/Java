import java.util.*;
public class Unique {
    static int findUnique(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                    
                }
                
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                ans = arr[i];
                
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(findUnique(arr));
    }
    
}
