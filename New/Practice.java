// public class Practice {
//     static int count(int arr[],int x){
//         int lastIndex=-1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==x) {
//                 lastIndex=i;
//             }
            
//         }
//         return lastIndex;
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int arr[]={1,2,2,3,4,5,2};
//         System.out.print(count(arr, x));
//     }
    
// }

public class Practice {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");  
            }
            System.out.println();
        }
    }
}