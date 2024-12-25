package Practice;

public class SubArray {
    public static void subArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = i; k < j; k++){
                    System.out.print(arr[k]);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subArray(arr);
    }
    
}
