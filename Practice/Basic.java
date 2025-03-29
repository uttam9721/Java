 // package Practice;
 // public class Basic {
 //     public static void update(int num[]){
 //         for (int i = 0; i < num.length; i++) {
 //             num[i]=num[i]+1;   
 //         }
 //     }
 //     public static int Search(int num[],int key){
 //         for (int i = 0; i < num.length; i++) {
 //            if (num[i]==key) {
 //             return i;
 //            }
 //         }
 //         return -1;
 //     }
 //     public static void main(String[] args) {
 //         int num[]={9,19,29,39,49,59};
 //         int key = 19;
 //        int idx=Search(num, key);
 //        if(idx==-1){
 //         System.out.println("not found"+idx);
 //        }else{
 //         System.out.println("yes"+idx);
 //        }
 //     }
 // }

// package Practice;
// public class Basic {
//     public static int Search(int num[],int key){
//         for (int i = 0; i < num.length; i++) {
//             if (num[i]==key) {
//                 return i; 
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int num[]={10,20,30,40,50,60};
//         int key=30;
//         int idx = Search(num, key);
//         if (idx==-1) {
//             System.out.println("Not Found  "+idx);
          
//         }else{
//             System.out.println("found  "+idx);
//         }
//     }
// }


// package Practice;

//  public class Basic {
//      public static int Largest(int num[]){
//          int largest = Integer.MIN_VALUE;
//          for (int i = 0; i < num.length; i++) {
//              if(largest<num[i]){
//                largest=num[i];
//          }
//      }
//      return largest;
//  }
//      public static void main(String[] args) {
//          int num[]={10,20,30,40,55};
//          System.out.println(Largest(num));
//      }
//  }

// package Practice;

//  public class Basic {
//      public static int binarySearch(int arr[],int key){
//          int start =0;
//          int end = arr.length-1;
//          while (start<=end) {
//              int mid = (start+end)/2;
//              if (arr[mid]==key) {
//                  return mid;              
//              }if (arr[mid]<key) {
//                  start = mid+1;              
//              }else{
//                  end = mid-1;
//              }  
//          }
//          return -1;
// }
//      public static void main(String[] args) {
//          int arr[]={2,4,6,8,10,12,14};
//          int key=41;
//          System.out.println(binarySearch(arr, key));
//      }
//  }


// package Practice;

//  public class Basic {
//          public static void Reverse(int arr[]){
//              for(int i=arr.length-1;i>=0;i--){
//                  System.out.print(" "+arr[i]);
//              }  
//          }
//      public static void main(String[] args) {
//          int arr[]={1,2,3,4,5,6};
//          // System.out.print(Reverse(arr));
//          Reverse(arr);  
//      }
//  }


// package Practice;

// public class Basic {
//     public static void reverse(int arr[]) {
//         int first = 0;
//         int last = arr.length - 1;
//         while (first < last) {
//             int temp = arr[last];
//             arr[last] = arr[first];
//             arr[first] = temp;
//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50};
//         reverse(arr); // Reverse the array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " "); // Print the reversed array
//         }
//     }
// }


// package Practice;

// public class Basic {
//     public static void Pair(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             int curr = arr[i];
//             for (int j =i+1; j < arr.length; j++) {
//                 System.out.print("("+curr+","+arr[j]+")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         Pair(arr);
//     }
// }



// package Practice;
// public class Basic {
//     public static void Duplicate(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i]==arr[j]) {
//                     System.out.print(arr[i]+" ");
//                 }
                
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={2,4,6,2,8,10,6,4};
//         Duplicate(arr);
//     }
// }

// package Practice;

// public class Basic {
//     public static void Common(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr[i]==arr[j]) {
                    
//                 }
//             }
            
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         int arr1[]={10,60,50,20,100};

    // }
// }


// Largest Number

// public class Basic {
//     public static int Largest(int arr[]){
//         int largest=0;
//         for (int i = 0; i < arr.length; i++) {
//             if (largest<arr[i]) {
//                 largest=arr[i];  
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int arr[]={10,20,30,5,25,60};
//         System.out.println(Largest(arr));
//     }
// }

// Binary Number
// public class Basic {
//     public static int binarySearch(int arr[],int key){
//         int start=0;
//         int end=arr.length-1;
//         while (start<=end) {
//             int mid=(start+end)/2;
//             if(arr[mid]==key){
//                 return mid;
//             }if (arr[mid]<key) {
//                 start=mid+1;
                
//             }else{
//                 end = mid-1;
//             }
            
//         }
//         return -1;
        
//     }

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int key=6;
//         System.out.println(binarySearch(arr,key));
//     }
// }

// public class Basic {
//     public static void reverse(int arr[]){
//         int first=0;
//         int last = arr.length-1;
//         while(first<last){
//             int temp = arr[last];
//             arr[last]=arr[first];
//             arr[first]=temp;
//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,5,6};
//         reverse(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// // String 
// import java.util.*;
// public class Basic {

//     public static void main(String[] args) {
//         // Scanner sc =new Scanner(System.in);
//         String str = "Uttam Maurya";
//         // String str1 = "Nitin Maurya";
//         // String str=sc.next();
//         // String str1=sc.nextLine();
//         // System.out.println(str);
//         // System.out.println(str.length());
//         // System.out.println(str.charAt(0));
//         // System.out.println(str.indexOf('U'));
//         // System.out.println(str.compareTo(str1));
//         // System.out.println(str.toUpperCase());
//         // System.out.println(str.concat(str1));
//         System.out.println();
//     }
// }