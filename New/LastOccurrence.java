

package New;

import java.util.Scanner;

public class LastOccurrence {
    static int LastNum(int [] arr,int x){
        int lastIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                lastIndex=i; 
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,3,2,5,6,2};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(LastNum(arr, x));

    }
}