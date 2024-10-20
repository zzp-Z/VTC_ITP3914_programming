package week3;

import java.util.Scanner;

public class Lab6E8 {
    public static void main(String[] args) {

        // Step 1: Input data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam mark? ");
        double mark = scanner.nextDouble();

        // Step 2: Calculate
        String grade = determineGrade(mark);

        // Step 3: Output result
        System.out.println("Grade = " + grade);

    }

    public static String determineGrade(double mark) {
        if (mark <= 59) {
            return "F";
        }else if (mark <= 69) {
            return "D";
        } else if (mark <= 79) {
            return "C";
        } else if (mark <= 89) {
            return "B";
        } else {
            return "A";
        }
    }
}
