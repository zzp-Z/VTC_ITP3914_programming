package week4;

import java.util.Scanner;

public class Lab7E11 {
    public static void main(String[] args) {
        // Step 1: Get the input
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int number = 0;
        while (true){
            System.out.print("Value? ");
            double value = scanner.nextDouble();
            if (value <= 0) {
                break;
            }
            number++;
            sum += value;
        }

        double average = sum / number;
        System.out.println("Average = " + average);
    }
}
