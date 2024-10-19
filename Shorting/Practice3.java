package Shorting;
import java.util.*;
public class Practice3 {
    static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos=j;

            }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
    }

    }
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev = i-1;
            while (prev>=0 && arr[curr]>curr) {
                arr[prev+1]=arr[prev];
                prev--;

            
        }
        arr[prev+1]=curr;
        }

    }
       public static void main(String[] args) {
        int arr[]={2,1,5,6,10};
        // bubbleSort(arr);
        // SelectionSort(arr);
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
