package Shorting;
public class BubbleSort {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;   
                }   
            }  
        }
    }
    public static void main(String[] args) {
        int arr []= {2,5,1,9,5,6,4};
      
        bubbleSort(arr);
        for(int i :arr){
            System.out.print(i  +" ");
        }
    }
    
}
