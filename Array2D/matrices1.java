package Array2D;

import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
        
    }
    System.out.println();
    }
    }
    
}
