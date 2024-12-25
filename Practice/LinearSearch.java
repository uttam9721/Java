
package Practice;
// package Arrays;

public class LinearSearch {
    public static boolean linearSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,9,7,8,10,15};
        int key =18;
        System.out.println(linearSearch(arr, key));
        }
    }