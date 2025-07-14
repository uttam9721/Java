import java.util.Scanner;

public class TripleSum {
    static int tripleSum(int arr[],int target){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k< arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target) {
                        ans++;
                        
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of Target:");
        int target = sc.nextInt();
        System.out.println(tripleSum(arr, target));

        }
}
