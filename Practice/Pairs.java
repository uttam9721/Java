package Practice;

public class Pairs {
    public static void getPairs(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+arr[j]+")");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        getPairs(arr);
    }
    
}
