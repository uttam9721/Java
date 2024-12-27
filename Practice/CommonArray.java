package Practice;

public class CommonArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 50, 90, 100};
        int arr1[] = {10, 2, 90, 50, 30, 100};

        System.out.println("Common elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) { // Start from 0 for the second array
                if (arr[i] == arr1[j]) { // Compare elements from both arrays
                    System.out.print(arr[i] + " ");
                    break; // Break to avoid duplicate prints for the same element
                }
            }
        }
    }
}
