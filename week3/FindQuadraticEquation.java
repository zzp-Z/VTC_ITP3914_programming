package week3;

import java.util.Scanner;

public class FindQuadraticEquation {
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
            System.out.println("No solution");
            return;
        }
        System.out.println("x = " + (-b + v) / (2 * a));
        System.out.println("x = " + (-b - v) / (2 * a));
    }

    public static double calculateV(double a, double b, double c) throws Exception {
        double v = b * b - 4 * a * c;
        if (v < 0) {
            throw new Exception();
        }
        return Math.sqrt(v);
    }
}
