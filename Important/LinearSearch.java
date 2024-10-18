public class LinearSearch {
    public static int linear(int num[],int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key= 20;
        int index = linear(arr, key);
        if (index == -1) {
            System.out.println("Element is not present in array");
            
        }
        else{
            System.out.println("Element is present at index "+index);
        }
    }
}
