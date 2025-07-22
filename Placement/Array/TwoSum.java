public class TwoSum {
    static void sum(int arr[],int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x) {
                    System.out.println(arr[i]+" "+ arr[j]);
                    
                }
            }
        }
        // return arr[i];
    }
    public static void main(String[] args) {
        int []arr ={83,21,38,69,74,12};
        int x = 81;
        // System.out.println(sum(arr, x));
        sum(arr, x);
    }
    
}
