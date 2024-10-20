package week3;

import java.util.Scanner;

public class Lab6E9 {
    public static void main(String[] args) {
        // Step 1: Get input value
        Scanner scanner = new Scanner(System.in);
        double a, b, c, v;
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        try {
            v = calculateV(a, b, c);
        } catch (Exception e) {
            return;
        }
        double x1 = (-b + v) / (2 * a);
        double x2 = (-b - v) / (2 * a);
        if (x1 != x2) {
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
            return;
        }
        System.out.println("x = " + x1);
    }

    public static double calculateV(double a, double b, double c) throws Exception {
        // Step 1: Validate input
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            throw new Exception();
        }
        // Step 2: Calculate v
        double v = b * b - 4 * a * c;

        // Step 3: Validate v
        if (v < 0) {
            System.out.println("No real solution");
            throw new Exception();
        }
        return Math.sqrt(v);
    }
}
