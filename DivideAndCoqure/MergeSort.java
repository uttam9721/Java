package DivideAndCoqure;

public class MergeSort {
    public static void merge(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        // mid
        int mid = (si+ei)/2;
       merge(arr,si,mid); //left part 
       merge(arr,mid+1,ei); //right part
       merge(arr,si,mid,ei); //merge two sorted array


    }
    public static void mergesort(int arr[],int si,int ei,int mid){
        int temp [] = new int [ei-si+1];

    }


    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6,};
        merge(arr, 0, arr.length-1);
        //
    }
    
}
