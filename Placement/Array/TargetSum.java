package Placement.Array;
import java.util.*;


public class TargetSum {
     static int target(int arr[],int target){
         int count= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    count++;
                    
                    
                }
            }
           
        }return count;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n = sc.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter the " +n + "Element of an Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt(); 
        }

        System.out.println("Enter value of Target..");
        int target = sc.nextInt();
        
        System.out.println(target(arr, target));
    }
    
}
