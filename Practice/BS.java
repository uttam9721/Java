package Practice;

public class BS {
    public static int bs(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == key){
                return mid;
            }
        if (arr[mid]<key) {
            start = mid + 1;
        }else{
            end = mid -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,9,8,4,3,1,20};
        int key = 4;
    }
    
}
