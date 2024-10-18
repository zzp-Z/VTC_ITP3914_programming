/**
 * Filename:        ValidateHKID.java
 * Programmer:	    Zhang Zipang
 * Description:     Determine the check digit of HKID numbers.
 */
package week2;

import java.util.Scanner;

public class ValidateHKID {
    public static void main(String[] args) {
        // Step 1: Get the input
        Scanner kb = new Scanner(System.in);
        System.out.print("你的身份證號： ");
        String str = kb.next();

        // Step 2: Calculate the check digit
        char[] letter;
        int sum;
        int code;
        letter = str.toCharArray();
        letter[0] = Character.toUpperCase(letter[0]);
        sum = ((int) letter[0] - 64) * 8;
        sum = sum + ((int) letter[1] - 48) * 7;
        sum = sum + ((int) letter[2] - 48) * 6;
        sum = sum + ((int) letter[3] - 48) * 5;
        sum = sum + ((int) letter[4] - 48) * 4;
        sum = sum + ((int) letter[5] - 48) * 3;
        sum = sum + ((int) letter[6] - 48) * 2;
        code = 11 - (sum % 11);

        // Step 3: Print the result
        System.out.print("The HKID is: " + letter[0] + str.substring(1, 7));
        if (code == 11) {
            System.out.println("(0)");
        } else if (code == 10) {
            System.out.println("(A)");
        } else {
            System.out.println("(" + code + ")");
        }
    }
}
