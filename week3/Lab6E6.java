package week3;

import java.util.Scanner;

public class Lab6E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Street number?");
        int streetNumber = scanner.nextInt();

        if (streetNumber % 2 == 0) {
            System.out.println("East-bound");
        } else {
            System.out.println("West-bound");
        }
    }
}
