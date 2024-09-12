// /**
//  * check
//  */
// public class check {
//     public static void Bubble(int arr[]){
//         for (int i = 0; i < arr.length-2; i++) {
//             for (int j = 0; j < arr.length-2-i; j++) {
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
                
//             }

//         }
//     }
//         public static void printArr(int arr[]){
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");

//     }
//     System.out.println();
// }

//     public static void main(String[] args) {
//         int arr[]={10,20,10,2,5,4,50};
//         Bubble(arr);
//         printArr(arr);
//     }
// }
// // }


/**
 * check
 */
// public class check {
//     public static void reverse(int arr[]){
//         int first=0;
//         int last= arr.length-1;
//         while(first<last){
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//              last--;

//     }
//     }

    

//     public static void main(String[] args) {
//         int arr[]={10,20,10,2,5,4,50};
//         reverse(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

/**
 * check
 */
public class check {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[minPos]>arr[j]){
                    minPos = j;

    }
    }
    int temp = arr[minPos];
    arr[minPos] = arr[i];
    arr[i] = temp;
    }

    public static void main(String[] args) {
        int arr[]={10,5,8,9,45,50,100,200};
        selectionSort(arr);
        
    }

    }
