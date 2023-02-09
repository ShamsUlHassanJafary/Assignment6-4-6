package Assignment6Of4.AbsoluteDiffrence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Read in the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of the primary diagonal
        int primaryDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            primaryDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            secondaryDiagonalSum += matrix[i][3 - i - 1];
        }

        // Calculate the absolute difference between the two diagonal sums
        int absoluteDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

        // Print the result
        System.out.println(absoluteDifference);
    }
}
