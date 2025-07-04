import java.util.*;
public class Basic {
    public static void main(String[] args) {
        int [] arr  =new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        // normal array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        // for-each we can not print few value of an array this is draw back;
        for(int age:arr){
            System.out.println(age);
        }
    }
    
}
