// import java.util.*;

// public class Basic {
//     static int sumofArray(int[]arr){
//         int sum=0;
//         int arr1 []= { 4 ,3 ,2, 1 ,0};
//         for (int i = 0; i < arr.length; i++) {
//             sum=sum+arr[i];  
//         }
//         return sum;
//     }
//     static int findMax(int arr[]){
//         // int max=Integer.MAX_VALUE;
//         int max =arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]<max) {
//                 max=arr[i]; 
//             }
//         }
//         return max;
//     }
//     static int repeating(int arr[],int x){
//         int count =0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==x) {
//                 count++;
                
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a size of an Array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter value of x");
//         int x=sc.nextInt();

//         System.out.println("Enter the element of an Array");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         // System.out.println(sumofArray(arr));
//         // System.out.println(findMax(arr));
//         // System.out.println(repeating(arr, n));
//         System.out.println(repeating(arr, x));


        
//     }

    
// }

// class Basic{
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40};
//         int sum =0;
//         for (int i = 0; i < arr.length; i++) {
//             sum=sum+arr[i];
//         }
//         System.out.print(sum+" ");
//     }
// }

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array;");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of an x");
        
        int x =5;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                System.out.println("Mill gya");
            }
        }

    }
}