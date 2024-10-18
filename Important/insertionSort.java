import java.util.Arrays; // Import the Arrays class for using Arrays.sort()

public class insertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // start from 1, as the first element is already sorted
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) { // compare arr[prev] to curr
                arr[prev + 1] = arr[prev]; // shift the element
                prev--;
            }
            arr[prev + 1] = curr; // place the current element in its correct position
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        // Uncomment this line if you want to use your insertion sort implementation
        // insertionSort(arr);

        // Use Arrays.sort() instead of insertion sort
        Arrays.sort(arr);
        printArray(arr);
    }
}
