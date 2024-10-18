package week2;

import java.util.Scanner;

public class CalculateGeometric {
    public static void main(String[] args) {

        // Step 1: Get the input
        Scanner kb = new Scanner(System.in);
        System.out.print("輸入R: ");
        double r = kb.nextDouble();
        System.out.print("輸入n: ");
        int n = kb.nextInt();
        System.out.print("輸入a: ");
        double a = kb.nextDouble();

        double s = (a * (Math.pow(r, n) - 1)) / (r - 1);
        System.out.println("s = " + s);
    }
}
