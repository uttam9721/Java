// // package Practice;

// // public class Basic {

// //     public static void update(int num[]){
// //         for (int i = 0; i < num.length; i++) {
// //             num[i]=num[i]+1;   
// //         }
// //     }
// //     public static int Search(int num[],int key){
// //         for (int i = 0; i < num.length; i++) {
// //            if (num[i]==key) {
// //             return i;
// //            }
// //         }
// //         return -1;
// //     }
// //     public static void main(String[] args) {
// //         int num[]={9,19,29,39,49,59};
// //         int key = 19;
// //        int idx=Search(num, key);
// //        if(idx==-1){
// //         System.out.println("not found"+idx);
// //        }else{
// //         System.out.println("yes"+idx);
// //        }
// //     }
// // }

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


package Practice;

public class Basic {
    public static int Largest(int num[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(largest<num[i]){
              largest=num[i];
        }
    }
    return largest;
}

    public static void main(String[] args) {
        int num[]={10,20,30,40,55};
        System.out.println(Largest(num));

    }
}