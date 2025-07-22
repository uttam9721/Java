// import java.util.Scanner;

// public class SecondLargest {
//     static int findMax(int arr[]){
//         int mx =Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]>mx) {
//                 mx = arr[i];
                
//             }
//         }
//         return mx;
//     }
//     static int secondMax(int arr[]){
//         int mx = findMax(arr);
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==mx) {
//                 arr[i]=Integer.MIN_VALUE;
                
//             }
//         }
//         int secondLargest = findMax(arr);
//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int n = sc.nextInt();
//         int arr[]=new int[n];

//         System.out.println("Enter the value of an element");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         // System.out.println(findMax(arr));
//         System.out.println(secondMax(arr));
//     }
    
// }


public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, 3, 8, 7, 9, 10};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + smax);
    }
}
