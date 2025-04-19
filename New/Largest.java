package New;

public class Largest {
    static int findLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                if (max<arr[i]) {
                    max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,4,2,3,8,9,10,50};
        System.out.print(findLargest(arr));
    }
    
}
