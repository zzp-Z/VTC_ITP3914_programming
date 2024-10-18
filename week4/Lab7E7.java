package week4;

import java.util.Scanner;

public class Lab7E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of stars? ");
        int n = scanner.nextInt();
        System.out.println("*".repeat(n));
    }
}
