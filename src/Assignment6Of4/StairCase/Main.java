package Assignment6Of4.StairCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the height of stairCase: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
