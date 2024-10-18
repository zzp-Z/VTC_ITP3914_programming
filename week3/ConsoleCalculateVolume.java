package week3;

import java.util.Scanner;

public class ConsoleCalculateVolume {
    public static void main(String[] args) {
        // Step 1: Get data
        Scanner scanner = new Scanner(System.in);
        System.out.println("input cylinder r: ");
        double r = scanner.nextDouble();
        System.out.println("input cylinder h: ");
        double h = scanner.nextDouble();

        // Step 2: Calculate
        double volume = Math.PI * r * r * h;

        // Step 3: Output result
        System.out.println("volume: " + volume);
    }
}
