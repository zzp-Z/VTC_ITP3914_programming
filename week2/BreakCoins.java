package week2;

import java.util.Scanner;

public class BreakCoins {
    public static void main(String[] args) {

        // Step 1: Get the input
        Scanner kb = new Scanner(System.in);
        System.out.print("Input an amount: ");
        double amount;
        try {
            amount = kb.nextDouble();
            amount = amount * 100;
            // check if the input is valid
            if (amount < 0) {
                throw new Exception();
            }
            if (amount % 1 != 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        int amountCents = (int) amount;
        System.out.println("The minimum numbers of coins for " + amount / 100 +" dollars are:");

        // Step 2: tenDollar
        int tenDollar = amountCents / 1000;
        amountCents = amountCents % 1000;
        System.out.println("Ten Dollar: " + tenDollar);

        // Step 3: fiveDollar
        int fiveDollar = amountCents / 500;
        amountCents = amountCents % 500;
        System.out.println("Five Dollar: " + fiveDollar);

        // Step 4: oneDollar
        int oneDollar = amountCents / 100;
        amountCents = amountCents % 100;
        System.out.println("One Dollar: " + oneDollar);

        // Step 5: fiftyCent
        int fiftyCent = amountCents / 50;
        amountCents = amountCents % 50;
        System.out.println("Fifty Cent: " + fiftyCent);

        // Step 6: tenCent
        int tenCent = amountCents / 10;
        amountCents = amountCents % 10;
        System.out.println("Ten Cent: " + tenCent);

        // Step 7: cent
        System.out.println("Cent: " + amountCents);

        System.out.println("Total: " + (tenDollar + fiveDollar + oneDollar + fiftyCent + tenCent + amountCents));
    }
}
