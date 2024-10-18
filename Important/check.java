// // /**
// //  * check
// //  */
// // public class check {
// //     public static void Bubble(int arr[]){
// //         for (int i = 0; i < arr.length-2; i++) {
// //             for (int j = 0; j < arr.length-2-i; j++) {
// //                 if(arr[j]>arr[j+1]){
// //                     int temp = arr[j];
// //                     arr[j] = arr[j+1];
// //                     arr[j+1] = temp;
// //                 }
                
// //             }

// //         }
// //     }
// //         public static void printArr(int arr[]){
// //             for (int i = 0; i < arr.length; i++) {
// //                 System.out.print(arr[i] + " ");

// //     }
// //     System.out.println();
// // }

// //     public static void main(String[] args) {
// //         int arr[]={10,20,10,2,5,4,50};
// //         Bubble(arr);
// //         printArr(arr);
// //     }
// // }
// // // }


// /**
//  * check
//  */
// // public class check {
// //     public static void reverse(int arr[]){
// //         int first=0;
// //         int last= arr.length-1;
// //         while(first<last){
// //             int temp = arr[first];
// //             arr[first] = arr[last];
// //             arr[last] = temp;
// //             first++;
// //              last--;

// //     }
// //     }

    

// //     public static void main(String[] args) {
// //         int arr[]={10,20,10,2,5,4,50};
// //         reverse(arr);
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.print(arr[i]+" ");
// //         }
// //     }
// // }

// /**
//  * check
//  */
// // public class check {
// //     public static void selectionSort(int arr[]){
// //         for (int i = 0; i < arr.length-1; i++) {
// //             int minPos = i;
// //             for (int j = i+1; j < arr.length-1; j++) {
// //                 if(arr[minPos]>arr[j]){
// //                     minPos = j;

// //     }
// //     }
// //     int temp = arr[minPos];
// //     arr[minPos] = arr[i];
// //     arr[i] = temp;
// //     }

// //     public static void main(String[] args) {
// //         int arr[]={10,5,8,9,45,50,100,200};
// //         selectionSort(arr);
        
// //     }

// //     }


// /**
//  * check
//  */
// // public class check {
// //     public static int LinearSearch(int arr[]){
// //         int largest = Integer.MIN_VALUE;
// //         for (int i = 0; i < arr.length; i++) {
// //           if(largest<arr[i]){
// //             largest = arr[i];

// //             // int temp = arr[i]


// //           }


// //     }
// //     return largest;
// //     }

// //     public static void main(String[] args) {
// //         int arr[]={10,5,8,9,45,50,100};
// //         // int key = 9;
// //         // for (int i = 0; i < arr.length; i++) {
            
// //             System.out.println(LinearSearch(arr));
// //         // }
       
// //     }
// // }

// /**
//  * check
//  */
// public class check {
//     public static void reverse(int[] arr) {
//         int start = 0, end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[end];
//             arr[end] = arr[start];
//             arr[start] = temp;
//             start++;
//             end--;
//     }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1,2,3,4,5,6,7,8,9,10};
//         reverse(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

/**
 * check
 */
// public class check {
//     public static void pair(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             int curr = arr[i];
//             for (int j =i+1; j < arr.length; j++) {
//                 System.out.print("("+ curr + "," + arr[j]+")"); 
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]= {2,4,6,8,10};
//         pair(arr);

//     }
// }

/**
 * check
 */
public class check {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[]= { 5,6,30,4,2,1,100};
    }
}