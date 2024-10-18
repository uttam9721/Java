public class bubleshort {
    public static void buble(int arr[]){
        for (int i = 0; i < arr.length-2; i++) {
            for(int j = 0; j < arr.length-2 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            }
            
        }
        public static void printArray(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        buble(arr);
        printArray(arr);
    
}
}

