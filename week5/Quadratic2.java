package week5;

import java.util.Scanner;

public class Quadratic2 {

    public static void main(String[] args) {
        // Step 1: Read input from user and check validity
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter the value of a: ");
            a = sc.nextDouble();

            System.out.print("Enter the value of b: ");
            b = sc.nextDouble();

            System.out.print("Enter the value of c: ");
            c = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Input is not int");
            return;
        }


        // Step 2: Calculate roots
        if (a == 0) {
            System.out.println("This is not a quadratic equation");
        }else {
            double d = Math.pow(b, 2) - 4 * a * c;

            if (d < 0) {
                System.out.println("The roots are imaginary");
            } else {
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Root 1: " + root1);
                System.out.println("Root 2:" + root2);
            }
        }
    }
}
