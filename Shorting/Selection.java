package Shorting;

public class Selection {
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index=j;   
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;            
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,5,1,2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
