// import java.util.*;

// // package New;

// public class Sorted {
//     public static boolean  isSorted(int[] arr){
//         boolean check=true;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i]<arr[i-1]) {
//                 check=false;
//                 break;
                
//             }
//         }return check;
//     }

//     public static void main(String[] args) {
//         // int arr[]={1,2,3,4,6,5,8,9,10};
//         int arr[]={1,2,3,4,5,6};
//         System.out.println(isSorted(arr));

//     }
// }


package New;

public class Sorted {
    public static int Done(int arr[],int target){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    ans++;
            }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,8,5};
        int target=7;
        System.out.println(Done(arr, target));
       
    }
}