public class selection {
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j =i+1; j < arr.length-1; j++) {
                if (arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            
        // }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
    System.out.println();

}
    public static void main(String[] args) {
        int arr[] = {5,6,4,2,3,1};
        selection(arr);
        printArray(arr);
    }
    
}
