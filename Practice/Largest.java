package Practice;
import java.util.*;

public class Largest {
    public static int getLargest(int arr[]){
        int largest =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
               largest=arr[i]; 
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]={5,6,8,1,3,0};
        System.out.println(getLargest(arr));
    }
}