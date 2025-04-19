public class Unique {
    static int findUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {  // <-- Added i != j
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 1, 4, 2};
        System.out.println(findUnique(arr));  // Output: 4
    }
}
