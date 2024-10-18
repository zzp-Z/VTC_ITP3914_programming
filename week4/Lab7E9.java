package week4;

import java.util.Scanner;

public class Lab7E9 {
    public static void main(String[] args) {
        // Step 1: Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of n? ");
        int n = scanner.nextInt();

        // Step 2: Check the input
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        // Step 3: Calculate the factorial
        double value = 1L;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) System.out.print(" x ");
            else System.out.print(" = ");
            value = value * i;
        }

        // Step 4: Output the result
        System.out.println(value);
    }
}
