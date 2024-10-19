package Shorting;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int arr[]={0,1,5,0,4,10};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]==0 && arr[j+1]!=0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}