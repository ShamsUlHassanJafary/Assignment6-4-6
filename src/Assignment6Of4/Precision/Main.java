package Assignment6Of4.Precision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("provide the size of an array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf("%.6f\n", (double) positiveCount / n);
        System.out.printf("%.6f\n", (double) negativeCount / n);
        System.out.printf("%.6f\n", (double) zeroCount / n);
    }
}

