import java.util.*;
public class LargestNumber {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;  //-infinitive
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest=arr[i];                  //-infinitive means integer.MIN.VALUE
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={10,20,5,60};
        System.out.println("largest value"+ largest(arr));
    }
    
}
