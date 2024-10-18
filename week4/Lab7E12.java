package week4;

import java.util.Scanner;

public class Lab7E12 {
    public static void main(String[] args) {
        // Step 1: Get the input
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Value? " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Step 2: reports the number of odd and even values
        int oddCount = 0;
        int evenCount = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of odd values  = " + oddCount);
        System.out.println("Number of even values = " + evenCount);
    }
}
