package week4;

import java.util.Scanner;

public class Lab7E10 {
    public static void main(String[] args) {
        // Step 1: Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many values to enter?");
        int manyValue = scanner.nextInt();

        // Step 2: Get the values
        double[] values = new double[manyValue];
        for (int i = 0; i < manyValue; i++) {
            System.out.print("Value? " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }

        // Step 3: Calculate average
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double average = sum / manyValue;
        System.out.println("Average = " + average);
    }
}
