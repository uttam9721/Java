package Array2D;

import java.util.Scanner;

public class SortedMatrix {
    public static boolean staircase(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return row < matrix.length && col >= 0; // Key is found if loop terminates
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key = 10;

        boolean found = staircase(matrix, key);
        if (found) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }
}